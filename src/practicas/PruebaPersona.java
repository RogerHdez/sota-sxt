/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author josef
 */
public class PruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona bob = new Persona("bob");
        
        System.out.println(bob.getNombre());
        System.out.println(bob.getEdad());
        
        Persona zetina = new Persona("Zetina", 28);
        zetina.setPersona(new Persona("Dupont"));
        
        System.out.println(zetina.getNombre() + " tiene la edad de  " + 
                zetina.getEdad());
        
        bob.setPersona(zetina);
        
        System.out.println(bob.getNombre());
    }
    
}
