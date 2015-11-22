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
public class Laser implements Ifire 
{
    public String fire_name;

    public Laser() 
    {
        fire_name="Laser";
    
    }
    

    @Override
    public void Damaged() {
        System.out.println("400 Hit Damaged");
    }
    @Override
    public String GetName() {
        return fire_name;
    }
    
}
