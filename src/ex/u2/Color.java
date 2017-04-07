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
public class Color {
    
    public static final String ROJA = "ROJA";
    public static final String AMARILLA = "AMARILLA";
    public static final String VERDE = "VERDE";
    
    public static String getRandomTamanio(){
        int r = new Random().nextInt(2);
        switch(r){
            case 0:
                return ROJA;
            case 1:
                return AMARILLA;
            default:
                return VERDE;
        }
    }
}
