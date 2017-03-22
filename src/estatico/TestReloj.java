/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author josef
 */
public class TestReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hora h1 = new Hora();
        Hora h2 = new Hora("suizo");
        
        System.out.println(Hora.min);//2
        
        h1.getReloj();
        
        System.out.println(Hora.min);//7
        
        h2.getReloj();
        
        System.out.println(Hora.min);//12
    }
    
}
