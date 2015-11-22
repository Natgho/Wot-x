/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WOT_X_Garbage;

/**
 *
 * @author Natgho */

public abstract class Tank 
{   
    protected String description;
    public Engine motor;
    public Gun silah;
    public Suspension suspansiyon ;
    public Turret taret;
    public String GetDescription()
    {
        return description;
    }
    public void AddDescription(String tool)
    {
        description= description+" "+tool;
    }
    public abstract double Fiyat();
    public void Calistir()
    {
        System.out.println("Tank çalıştı.");
    }
}
