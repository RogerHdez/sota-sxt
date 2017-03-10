public class Persona{

  private String nombre;

  /** La clase recibe un nombre*/
  public Persona(String nombre){ /* el constructor*/
    this.nombre = nombre;
  }

  /** Retonar el nombre*/
  public String getNombre(){
    return this.nombre;
  }

  /** Asigna el nombre al objeto*/
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

}
