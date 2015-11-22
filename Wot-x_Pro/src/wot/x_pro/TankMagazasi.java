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
public class TankMagazasi {

    TankFactory factory;
    public TankMagazasi(TankFactory factory) {
        this.factory = factory;
    }
    
    public Tank TankSat(String tType)
    {
        return factory.CreateTank(tType);
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
