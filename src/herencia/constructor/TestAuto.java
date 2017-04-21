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
public class TestAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Automovil automovil = new Automovil("Vocho", "Verde fosforecente", 6);
       
        System.out.println(automovil.getColor());
        Sedan sedan = new Sedan(2, "Herby", "Blanco");
        Sedan vacio = new Sedan();
        Sedan tsuru = new Sedan(4, "Taxi", "Rojo taxi", 5);
        
        sedan.saludo();
        
        Moto moto = new Moto("Chopper", "Hippie", true);

        System.out.println(vacio);
        System.out.println(sedan.toString());
        System.out.println(automovil);
        System.out.println(tsuru);
        System.out.println(moto);
        System.out.println(sedan.getNombre());

        System.out.println(moto.getColor());

        Vocho v = new Vocho(true, 4, "Vosho", "Blanco polvo", 4);
        v.saludo();
        
//        Monociclo monociclo = new Monociclo("Morado", true);
//        System.out.println(monociclo.getNombre() + " " + monociclo.getColor());
    }

}
