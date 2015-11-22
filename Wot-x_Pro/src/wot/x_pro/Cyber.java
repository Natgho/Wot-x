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
public class Cyber extends Plane 
{
    public Cyber(Ifire fire)
    {
        this.fire = fire;
        name = "Cyber";
    }
    public String getName()
    {
        return name;
    }
    
}
