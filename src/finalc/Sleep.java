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
public class Sleep {
    
    //cuando tenemos variables final sin definir
    //se deben definir por medio del constructor
    //y el valor no puede cambiar
    //y ademas, no puede tener metodo *set()*
    
    private final int ZZZ = 4;//no se inicializa por constructor
    private final int DORMIR; //toda variable final debe ir en MAYUSCULA
    private int s = 0;
    
    public Sleep(int dormir){
        this.DORMIR = dormir;
    }

    public Sleep(int dormir, int s){
        this.DORMIR = dormir;
        this.s = s;
    }
    public int getDORMIR() {
        return DORMIR;
    }
    
    public int getSeguirDurmiendo(){
        final int i = 3;//variable local y final, su valor nunca cambia
        return s += DORMIR + i;
    }
    
}
