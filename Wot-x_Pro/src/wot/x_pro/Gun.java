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
public class Gun extends ParcaDecorator
{
        Tank tank;
    public Gun(Tank tank)
    {
        this.tank = tank;
    }

    @Override
    public String GetDescription() 
    {
        return tank.GetDescription() + " Gun İmplemented\n";
    }

    @Override
    public double fiyat() 
    {
       return tank.fiyat() + 150.25;
    }
    
    
}
