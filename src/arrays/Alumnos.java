/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author josef
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hacer un programa que saque 5 cartas de naipe al azar, en cuatro ocaciones
        
        String[] alumnos = new String[8];
         
        alumnos[0] = "Puing";
        alumnos[1] = "Omar";
        alumnos[2] = "Zetina";
        alumnos[3] = "Daniel";
        alumnos[4] = "Eleazar";
        alumnos[5] = "Carlos";
        alumnos[6] = "Victor";
        alumnos[7] = "Roger";
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
    }
    
}
