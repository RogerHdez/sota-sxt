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
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] alumnos = {"Puing", "Omar", "Zetina", "Daniel","Eleazar", 
            "Carlos", "Victor","Roger", "Nayely", "Haz", "Dupont"};
 
                        //FOREACH
         for(String nombreAlumno : alumnos){
             System.out.println(nombreAlumno);
         }
//        
        int[] n = {3,5,3,6,76,46,64,467,56,775,7,8,8,678,67,868};
        
        for(Integer numeros: n)
            System.out.println(numeros);
         
//         for (int i = 0; i < alumnos.length; i+=2) {
//             System.out.println(alumnos[i]);
//        }

    }
    
}
