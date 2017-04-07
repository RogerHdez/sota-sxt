/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.u2;

import java.util.Random;

/**
 *
 * @author josef
 */
public class Tamanio {
    
    public static final int CHICA = 1;
    public static final int MEDIANA = 2;
    public static final int GRANDE = 3;
    
    public static int getRandomTamanio(){
        int r = new Random().nextInt(2);
        switch(r){
            case 0:
                return CHICA;
            case 1:
                return MEDIANA;
            default:
                return GRANDE;
        }
    }
}
