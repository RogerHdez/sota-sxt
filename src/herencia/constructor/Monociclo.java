/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.constructor;

/**
 *
 * @author josef
 * Sobrecarga de métodos
 */
public class Monociclo extends Automovil{
    
    private boolean vuela;
    
    public Monociclo(String color) {
        super(null, color, 0);
    }

    public Monociclo(String color, boolean vuela) {
        super(null, color, 0);
        this.vuela = vuela;
    }
    
    @Override
    public String getNombre() {
        return "Mociclo"; 
    }

    @Override
    public int getRuedas() {
        return 1;
    }

    @Override
    public String getColor() {
        return super.getColor() + " Mono";
    }
    
    
    
}
