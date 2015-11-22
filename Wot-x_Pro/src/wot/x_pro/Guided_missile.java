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
public class Guided_missile implements Ifire
{
    public String fire_name;

    public Guided_missile() 
    {
        fire_name="Guided missile";
    }
    

    @Override
    public void Damaged() {
        System.out.println("300 Hit Damaged");
    }
    @Override
    public String GetName() {
        return fire_name;
    }
}
