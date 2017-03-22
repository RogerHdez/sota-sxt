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
public class Hora {

    public static int min = 2;
    public static int hr = 6;
    
    private String reloj;

    public Hora() {
    }

    public Hora(String reloj) {
        this.reloj = reloj;
    }

    public String getReloj() {
        min+=5;
        return reloj;
    }

    public void setReloj(String reloj) {
        this.reloj = reloj;
    }
    
    
}
