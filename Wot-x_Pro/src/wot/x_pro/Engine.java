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
public class Engine extends ParcaDecorator
{
    Tank tank;
    public Engine(Tank tank)
    {
        this.tank = tank;
    }

    @Override
    public String GetDescription() 
    {
        return tank.GetDescription() + " Engine İmplemented\n";
    }

    @Override
    public double fiyat() 
    {
       return tank.fiyat() + 250.55;
    }
    
}
