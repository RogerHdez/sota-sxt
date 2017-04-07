/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.u2;

/**
 *
 * @author josef
 */
public class Fruta {
    
    private final String nombre;
    private final String color;
    private final int tamanio;

    public Fruta(String nombre, String color, int tamanio) {
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getTamanio() {
        return tamanio;
    }

    
    
    
}
