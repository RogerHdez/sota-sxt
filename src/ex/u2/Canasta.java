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
public class Canasta {
    
    private final String nombre;
    private final Fruta[] frutas;
    private int numeroFruta;

    public Canasta(String nombre, Fruta[] frutas) {
        this.nombre = nombre;
        this.frutas = frutas;
    }

    public String getNombre() {
        return nombre;
    }

    public Fruta[] getFrutas() {
        return frutas;
    }

    public int getNumeroFruta() {
        return this.frutas.length;
    }
    
}
