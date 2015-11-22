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
public class Single_Plane 
{
    private static Single_Plane unique ;
    public Plane plane;
    private Single_Plane()
    {
        
    }
    public static Single_Plane getInstance( )
    {
        if (unique == null) 
        {
            unique = new Single_Plane();
            
        }
        return unique;
    }
    public Plane GetPlaneType(String ptype, Ifire fire)
    {
        if (plane == null) 
        {
            switch(ptype)
            {
                case "Cobra":
                    plane = new Cobra(fire);
                    break;
                case "Raptor":
                    plane = new Raptor(fire);
                    break;
                case "Cyber":
                    plane = new Cyber(fire);
                    break;
                default:
                    plane = null;
            }
                  
        }
        return plane;
    }
}
