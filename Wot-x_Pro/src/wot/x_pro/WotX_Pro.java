/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wot.x_pro;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Natgho
 */
public class WotX_Pro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int arac_sec= 0;
        int tank_sec=0;
        int parca_sec=0;
        int ucak_sec=0;
        int silah_sec=0;
        Single_Plane plane = null;
        TankFactory factory = new TankFactory();
        
        Tank tank = null;
        Scanner tara = new Scanner(System.in);
        System.out.println("Wot-X Pro uygulamasına hoşgeldiniz.");
        System.out.println("Lütfen üretmek istediğiniz aracın numarasını giriniz:\n1)Tank\n2)Uçak");
        arac_sec=tara.nextInt();
        if (arac_sec==1) 
        {
            do
        {
            
           System.out.println("Lütfen istediğiniz tankın numarasını giriniz:");
           System.out.println("1)Hafif Tank\n2)Orta Tank\n3)Ağır Tank\nÇıkmak için : 4");
           tank_sec=tara.nextInt(); 
           switch(tank_sec)
           {
               case 1:
                   tank = factory.CreateTank("Light Tank");
                   break;
               case 2:
                   tank = factory.CreateTank("Medium Tank");
                   break;
               case 3:
                   tank = factory.CreateTank("Heavy Tank");
                   break;
               case 4:
                   System.out.println("Sistemden tank seçmeden çıkış yaptınız.");
                   break;
               default:
                   System.out.println("Geçersiz bir sayı girdiniz.");
           }
        } while (tank_sec > 4 || tank_sec < 1);
        if (tank != null) 
        {
            System.out.println("Tanknız: " + tank.GetDescription() + "Tankın Fiyatı:" + tank.fiyat()+ "\n");
            
            do 
            {
                System.out.println("Lütfen tankınıza takmak istediğiniz parçaları seçiniz:");
                System.out.println("1)Motor\n2)Silah\n3)Süspansiyon\n4)Taret\n5)Çıkış");
                parca_sec = tara.nextInt();
                switch(parca_sec)
                {
                    case 1:
                        tank = factory.ParcaEkle(tank, "Engine");
                        System.out.println(tank.GetDescription());
                        break;
                    case 2:
                        tank = factory.ParcaEkle(tank, "Gun");
                        System.out.println(tank.GetDescription());
                        break;
                    case 3:
                        tank = factory.ParcaEkle(tank, "Suspension");
                        System.out.println(tank.GetDescription());
                        break;
                    case 4:
                        tank = factory.ParcaEkle(tank, "Turret");
                        System.out.println(tank.GetDescription());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Geçersiz bir sayı girdiniz.");
                }
            System.out.println("Tankın şu an ki durumu :\n" + tank.GetDescription() + "Ödenecek bedel: " + tank.fiyat()+ "\n");
            } while (parca_sec > 5 || parca_sec < 1);
             System.out.println("Tankınızı tamamladınız. \nTankınızın durumu;\n " + tank.GetDescription());
             System.out.println("Tankınızın toplam bedeli:" + tank.fiyat());
        }
        else
            {
            System.out.println("İyi günler.");
            }
        }
        else if (arac_sec == 2) 
        {
            plane = Single_Plane.getInstance();
            do
                {                
              System.out.println("Lütfen istediğiniz uçak cinsini seçiniz:\n1)Kobra\n2)Raptor\n3)Cyber");
            ucak_sec = tara.nextInt();
            switch(ucak_sec)
                {
                case 1:
                    plane.plane = plane.GetPlaneType("Cobra", new Atom());
                    break;
                case 2:
                    plane.plane = plane.GetPlaneType("Raptor", new Atom());
                    break;
                case 3:
                    plane.plane = plane.GetPlaneType("Cyber", new Atom());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Geçerli olmayan bir seçenek girdiniz.");
                }
            
            }
            while (ucak_sec > 4 || ucak_sec < 1); 
            
            System.out.println("uçak seçimi başarıyla tamamlandı. Uçağınız:" + plane.plane.name);
            do 
            {
                System.out.println("Lütfen Uçağınız için Füze seçimini yapınız:");
                System.out.println("1)Atom \n2)Güdümlü\n3)Misket\n4)Lazer\n5)Çıkış");
                silah_sec = tara.nextInt();
                switch(silah_sec)
                {
                    case 1:
                        plane.plane.SetFire(new Atom());
                        break;
                    case 2:
                        plane.plane.SetFire(new Guided_missile());
                        break;
                    case 3:
                        plane.plane.SetFire(new Marble());
                        break;
                    case 4:
                        plane.plane.SetFire(new Laser());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Geçersiz bir giriş yaptınız.");
                }
            } while (silah_sec > 5 || silah_sec < 1);
            System.out.println("Silah seçimi başarıyla tamamlandı. Silahınız:" + plane.plane.fire.GetName());
            System.out.println("Silah deneniyor...\n");
            plane.plane.PerformDamaged();
            
        }
        else
        {
            System.out.println("Yanlış giriş yaptınız");
        }
        
        
//        
//        tank = Factory.AddTool(tank, "Engine");
//        tank = Factory.AddTool(tank, "Gun");
//        tank = Factory.AddTool(tank, "Suspension");
//        tank = Factory.AddTool(tank, "Turret");
//        System.out.println(tank.GetDescription());
//        System.out.println(tank.fiyat());
//        
//        Single_Plane single = Single_Plane.getInstance();
//        single.GetPlaneType("Cobra", new Laser());
//        single.plane.PerformDamaged();
    }
    
}
