/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wot.x_pro;

/**
 *
 * @author Natgho
 */
public class TankFactory 
{
    public Tank CreateTank(String ttype)
    {
        switch(ttype)
        {
            case "Light Tank":
                return new Light_Tank();
                
            case "Medium Tank":
                return new Medium_Tank();
                
            case "Heavy Tank":
                return new Heavy_Tank();
                
            default:
                return null;  
        }   
    }
    public ParcaDecorator ParcaEkle(Tank tank, String ttype)
    {
         switch(ttype)
        {
            case "Engine":
                return new Engine(tank);
                
            case "Gun":
                return new Gun(tank);
                
            case "Suspension":
                return new Suspension(tank);
            case "Turret":
                    return new Turret(tank);
            default:
                return null;  
        }
    }
}
