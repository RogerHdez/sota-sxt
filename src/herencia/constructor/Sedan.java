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
public class Sedan extends Automovil{
    
    private final int tamanio;

    public Sedan(int tamanio, String nombre, String color) {
        super(nombre, color, 4);
        this.tamanio = tamanio;
    }
    
    public Sedan(){
        super();
        this.tamanio = 4;
    }

    public Sedan(int tamanio, String nombre, String color, int ruedas) {
        super(nombre, color, ruedas);
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }    
    
    @Override
    public String getNombre() {
        return super.getNombre() + " carrito";
    }

    @Override
    public String toString() {
        return super.toString() + ", tamaño: " + this.tamanio;
    }
 
    public String toString(String mensaje){
        return this.toString() + mensaje;
    }

    /**
     * El método final no puede ser re-escrito
     * @return */
    public final String tipo(){
        return "tipo Sedan";
    }
    
    /*El método tipo protected solo puede ser modificado y accesado por las
    clasese heredadas
    */
    protected void saludo(){
        System.out.println("Saludo desde mi " + this.getNombre());
    }
    
}
