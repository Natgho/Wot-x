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
public class Medium_Tank extends Tank 
{
    public Medium_Tank()
    {
        Description = "Medium Tank \n";
    }

    @Override
    public double fiyat() 
    {
       return 2500;
              
    }
    
}