/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WOT_X_Garbage;

import java.util.Scanner;

/**
 *
 * @author Natgho
 */
public class WOTX_Garbage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {       
        int tank_sec=0;
        int silah_sec=0;
        int ucak_sec=0;
        int arac_sec=0;
        int parca_sec=0;
        String ucak_durum = "";
        Tank tank = null;
        Scanner tara = new Scanner(System.in);
        double toplam;
        System.out.println("Wot-X Pro uygulamasına hoşgeldiniz.");
        System.out.println("Lütfen araç tipini seçiniz:");
        System.out.println("1)Tank\n2)Uçak\n");
        
        arac_sec=tara.nextInt();
        if(arac_sec==1)
        {
        if (true) {
            
        }
        do
        {
            toplam=0;
            System.out.println("Lütfen istediğiniz tankın numarasını giriniz:");
           System.out.println("1)Hafif Tank\n2)Orta Tank\n3)Ağır Tank\nÇıkmak için : 4");
           tank_sec=tara.nextInt();
           switch(tank_sec)
           {
               case 1:
                   tank = new Hafif_Tank();
                   toplam+=tank.Fiyat();
                 break;
               case 2:
                   tank = new Orta_Tank();
                   toplam+=tank.Fiyat();
                   break;
               case 3:
                   tank = new Agir_Tank();
                   toplam+=tank.Fiyat();
                   break;
               case 4:
                   System.out.println("Sistemden tank seçmeden çıkış yaptınız.");
                   break;
               default:
                   System.out.println("Geçersiz bir sayı girdiniz.");
           }
        } while (tank_sec>4 || tank_sec <1);
        if (tank != null) 
        {
            System.out.println("Tanknız: " + tank.GetDescription() + "Tankın Fiyatı:" + toplam+ "\n");
            
            do 
            {
                System.out.println("Lütfen tankınıza takmak istediğiniz parçaları seçiniz:");
                System.out.println("1)Motor\n2)Silah\n3)Süspansiyon\n4)Taret\n5)Çıkış");
                parca_sec = tara.nextInt();
                switch(parca_sec)
                {
                    case 1:
                        tank.AddDescription("Engine eklendi");
                        System.out.println(tank.GetDescription());
                        toplam+=tank.motor.Fiyat;
                        break;
                    case 2:
                       tank.AddDescription("Gun eklendi");
                        System.out.println(tank.GetDescription());
                        toplam+=tank.silah.Fiyat;
                        break;
                    case 3:
                        tank.AddDescription("Suspension eklendi");
                        System.out.println(tank.GetDescription());
                        toplam+=tank.suspansiyon.Fiyat;
                        break;
                    case 4:
                        tank.AddDescription("Turret eklendi");
                        System.out.println(tank.GetDescription());
                        toplam+=tank.taret.Fiyat;
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Geçersiz bir sayı girdiniz.");
                }
            System.out.println("Tankın şu an ki durumu :\n" + tank.GetDescription() + "Ödenecek bedel: " + toplam+ "\n");
            } while (parca_sec > 5 || parca_sec < 1);
             System.out.println("Tankınızı tamamladınız. \nTankınızın durumu;\n " + tank.GetDescription());
             System.out.println("Tankınızın toplam bedeli:" + toplam);
        }
        else
        {
            System.out.println("İyi günler.");
        }
        }
        //----------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------
        
        else
        {
            
            Plane _plane=new Plane();
            _plane.Run();
            do
            {
                System.out.println("Lütfen istediğiniz uçağın numarasını giriniz:");
                System.out.println("1)Cyber\n2)Cobra\n3)Raptor\nÇıkmak için : 4");
                ucak_sec=tara.nextInt();
                switch(ucak_sec)
                {
                    case 1:
                        Cyber _Cyber=new Cyber();
                        _Cyber.Run();
                        ucak_durum += "Cyber'da ";
                        break;
                    case 2:
                        Cobra _Cobra=new Cobra();
                        _Cobra.Run();
                        ucak_durum += "Cobra'da ";
                        break;
                    case 3:
                        Raptor _Raptor=new Raptor();
                        _Raptor.Run();
                        ucak_durum += "Raptor'da ";
                        break;
                    case 4:
                        System.out.println("Sistemden tank seçmeden çıkış yaptınız.");
                        break;
                    default:
                        System.out.println("Geçersiz bir sayı girdiniz.");
                }
            }while (ucak_sec >4 || ucak_sec<1);
            do 
            {
                System.out.println("Lütfen uçağın silahını seçiniz:");
                System.out.println("1)Atom\n2)Güdümlü Füze\n3)Misket\n4)Lazer\n5)Çıkış");
                silah_sec = tara.nextInt();
                switch(silah_sec)
                {
                    case 1:
                        Atom _Atom=new Atom();
                        _Atom.Run();
                        ucak_durum += "atom deneniyor";
                        break;
                    case 2:
                        Guided_missile _Guided_missile=new Guided_missile();
                        _Guided_missile.Run();
                        ucak_durum += "güdümlü füze deneniyor";
                        break;
                    case 3:
                         Marble _Marble=new Marble();
                        _Marble.Run();
                        ucak_durum += "misket bombası deneniyor";
                        break;
                    case 4:
                        Laser _Laser=new Laser();
                        _Laser.Run();
                        ucak_durum += "lazer. deneniyor";
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Geçersiz bir sayı girdiniz.");
                }
            } while (silah_sec <1 || silah_sec>5);
            System.out.println(ucak_durum);
        }
    }
}