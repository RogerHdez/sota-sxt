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
public class Automovil {  
    
    private final String nombre;
    private final String color;
    private final int ruedas;
    
    public Automovil(String nombre, String color, int ruedas) {
        this.nombre = nombre;
        this.color = color;
        this.ruedas = ruedas;
    }
    
    public Automovil(){
        this.nombre = "carro";
        this.color = "rosa bebe";
        this.ruedas = 3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return getColorOscuro(); 
        //return this.color;
    }

    public int getRuedas() {
        return ruedas;
    }

    @Override
    public String toString() {
        return "Mi auto se llama: " + nombre + ",es de color: " + color + ", tiene: "
                + ruedas + " ruedas ";
    }
    
    private String getColorOscuro(){
        return this.color + " oscuro";
    }
}
