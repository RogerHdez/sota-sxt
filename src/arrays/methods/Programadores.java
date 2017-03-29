/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.methods;

import java.util.Random;

/**
 *
 * @author josef
 * Clase de muestra para uso de constructores y métodos que reciben como 
 * parametros <strong>arreglos</strong>
 */
public class Programadores {
    
    private Programador[] programadores;

    public Programadores(Programador[] programadores) {
        this.programadores = programadores;
    }

    public Programador[] getProgramadores() {
        return programadores;
    }

    public void setProgramadores(Programador[] programadores) {
        this.programadores = programadores;
    }
 
    public Programador getProgramadorRandom(){
        return this.programadores[new Random().nextInt(this.programadores.length)];
    }
    
}
