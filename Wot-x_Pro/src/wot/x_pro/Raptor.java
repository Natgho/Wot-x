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
public class Raptor extends Plane
{

    public Raptor(Ifire fire)
    {
        this.fire = fire;
        name = "Raptor";
    }
    public String getName()
    {
        return name;
    }
    
}
