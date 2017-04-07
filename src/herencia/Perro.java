/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author josef
 */
public class Perro extends Mascota{
    
    private boolean babea;
    private boolean ladra;

    public Perro() {
    }

    public boolean isBabea() {
        return babea;
    }

    public void setBabea(boolean babea) {
        this.babea = babea;
    }

    public boolean isLadra() {
        return ladra;
    }

    public void setLadra(boolean ladra) {
        this.ladra = ladra;
    }

    @Override
    public String toString() {
        return "Perro{" + "babea=" + babea + ", ladra=" + ladra + '}';
    }
    
}
