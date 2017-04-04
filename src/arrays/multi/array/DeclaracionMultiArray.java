/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.multi.array;

import java.util.*;
/**
 *
 * @author josef
 */
public class DeclaracionMultiArray {
    
    public static void main(String[] args) {
        
       Random r = new Random();
        //declaracion de un array de 2x2    
        int[][] bidiRandom = new int[2][2];
        
        //lleno el array con numeros aleatorios
        for (int i = 0; i < bidiRandom.length; i++) {//FILA
            for (int j = 0; j < bidiRandom[i].length; j++) {//COLUMNA
                bidiRandom[i][j] = r.nextInt(50);   
            }
        }

        //imprimo el array con los datos almacenados
        for (int i = 0; i < bidiRandom.length; i++) {
            System.out.println(Arrays.toString(bidiRandom[i]));   
        }
       
       
        System.out.println("------------------------------");
        //Defino un array lleno previamente
        int[][] bidiLleno = {
            {4,5,7,5}, 
            {9,10,9},
            {r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt()},
            {4},
            {34,34,534,5, r.nextInt(r.nextInt())}
        };
        
        //imprimo el array #bidiLleno
        for (int i = 0; i < bidiLleno.length; i++) {           
            System.out.println(Arrays.toString(bidiLleno[i]));
        }
        
        System.out.println(bidiLleno[2][1]);//posicion especifica
    }
    
}
