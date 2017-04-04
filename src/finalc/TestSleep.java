/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalc;

/**
 *
 * @author josef
 */
public class TestSleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sleep sleep;
        sleep = new Sleep(5);
        
        System.out.println("el valor de DORMIR: " + 
                sleep.getDORMIR());
        
        System.out.println("el valor de seguir durmiendo: " +
                sleep.getSeguirDurmiendo());
        
        System.out.println("el valor de seguir durmiendo por segunda ocacion: " +
                sleep.getSeguirDurmiendo());
    }
    
}
