/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author josef
 */
public class Gato extends Mascota{
    
    private boolean vuelan;
    private boolean rompeMuebles;

    public Gato() {
    }

    public boolean isVuelan() {
        return vuelan;
    }

    public void setVuelan(boolean vuelan) {
        this.vuelan = vuelan;
    }

    public boolean isRompeMuebles() {
        return rompeMuebles;
    }

    public void setRompeMuebles(boolean rompeMuebles) {
        this.rompeMuebles = rompeMuebles;
    }

    @Override
    public String toString() {
        return "Gato{" + super.toString() + " vuelan=" + vuelan + ", rompeMuebles=" + rompeMuebles + '}';
    }
    
    
}
