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
public abstract class Plane
{
    public String name;
    Ifire fire ;
    public void SetFire(Ifire fire)
    {
        this.fire= fire;
    }
    public void PerformDamaged()
    {
        fire.Damaged();
    }
    
    
}
