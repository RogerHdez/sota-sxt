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
public class Persona {
    
   private String nombre;
   private int edad;
   private String tipoCabello;
   private boolean delgado;
  
  /** La clase recibe un nombr
     * @param nombre*/
  public Persona(String nombre){ /* el constructor*/
    this.nombre = nombre;
  }
  
  public Persona(String nombre, int edad){
      this.nombre = nombre;
      this.edad = edad;
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoCabello() {
        return tipoCabello;
    }

    public void setTipoCabello(String tipoCabello) {
        this.tipoCabello = tipoCabello;
    }

    public boolean isDelgado() {
        return delgado;
    }

    public void setDelgado(boolean delgado) {
        this.delgado = delgado;
    }
 
  
}
