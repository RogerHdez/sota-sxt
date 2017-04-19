/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.constructor;

/**
 *
 * @author josef
 */
public class Moto extends Automovil{
    
    private boolean caballito;

    public Moto(String nombre, String color,boolean caballito) {
        super(nombre, color, 2);
        this.caballito = caballito;
    }

    public boolean isCaballito() {
        return caballito;
    }

    public void setCaballito(boolean caballito) {
        this.caballito = caballito;
    }
    
    @Override
     public String getColor() {
         return "COLOR DESCONOCIDO";
    }
     
    @Override
    public String toString() {
        return super.toString() + ", van en caballito: " + caballito;
    }
      
}
