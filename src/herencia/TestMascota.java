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
public class TestMascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mascota m = new Mascota();
        
        Perro p = new Perro();
        
        Gato g = new Gato();
        g.setNombre("Octogato");
        g.setPatas(8);
        g.setRaza("Github");
        
        m.setNombre("nombre mascota");
        m.setPatas(3);
        m.setRaza("desconocida");
        System.out.println(m.getNombre() + ",  patas: " + m.getPatas() +
                ", raza:  " + m.getRaza() );
        
        p.setNombre("Firulais");
        p.setBabea(true);
        p.setPatas(6);
        p.setLadra(true);
        p.setRaza("Labrador");
        
        System.out.println(p.getNombre() + ", raza: " + p.getRaza() + "ladra: " +
                p.isLadra());
        
        System.out.println(g);
        
    }
    
}
