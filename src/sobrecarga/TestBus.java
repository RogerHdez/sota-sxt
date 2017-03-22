/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author josef
 */
public class TestBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Autobus autobus = new Autobus("Mercedez", 2000);
        
        autobus.acelerar();
        autobus.acelerar(6);
        autobus.acelerar("Metiendo chancla a fondo");
        
        System.out.println(autobus.parar());
        
        System.out.println(autobus.parar(10.54, "Mas rapido y mas fogosos"));
        
        String suma = String.format("%.2f", autobus.suma(2.4, 6.4, 7.4));
        System.out.println(suma);
        
    }
    
}
