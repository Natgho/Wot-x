/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WOT_X_Garbage;

/**
 *
 * @author Natgho
 */
public class Agir_Tank extends Tank
{

    public Agir_Tank() {
      motor = new Engine();
      silah = new Gun();
      suspansiyon = new Suspension();
      taret = new Turret();
      this.description="Ağır Tank\n";
    }

    @Override
    public double Fiyat() {
        return 3000;
    }
    
}
