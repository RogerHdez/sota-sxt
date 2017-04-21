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
public class Vocho extends Sedan{
    
    private boolean turbina;
    
    public Vocho(int tamanio, String nombre, String color, int ruedas) {
        super(tamanio, nombre, color, ruedas);
    }

    public Vocho(boolean turbina, int tamanio, String nombre, String color, int ruedas) {
        super(tamanio, nombre, color, ruedas);
        this.turbina = turbina;
    }
    
    @Override
    protected void saludo() {
        if(turbina)
            System.out.println("Saludos desde mi vochito con turbina de Jett");
        else
            System.out.println("Saludos desde mi vochito");
    }

    @Override
    public String toString() {
        return "Vocho{" + "turbina=" + turbina + '}';
    }
    
}
