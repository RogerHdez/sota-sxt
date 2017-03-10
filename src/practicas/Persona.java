/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author josef
 */
public class Persona {
    
   private String nombre;
   private int edad;
   private Persona persona;

  /** La clase recibe un nombre*/
  public Persona(String nombre){ /* el constructor*/
    this.nombre = nombre;
  }
  
  public Persona(String nombre, int edad){
      this.nombre = nombre;
      this.edad = edad;
  }
  
  public Persona(Persona p){
      persona = p;
  }

  /** Retonar el nombre*/
  public String getNombre(){
    return this.nombre;
  }

  /** Asigna el nombre al objeto*/
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public int getEdad(){
      return this.edad;
  }
  
  public void setEdad(int edad){
      this.edad = edad;
  }
  
  public void setPersona(Persona p){
      this.persona = p;
  }
  
  public Persona getPersona(){
      return this.persona;
  }

}
