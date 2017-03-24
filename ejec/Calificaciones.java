/**Aplicaciones de metodos*/

public class Calificaciones{

  // constructor
  public Calificaciones(){}

  /** Metodo que recibe tres calificaciones y hace la sumatoria
  * retornando la misma
  */
  public int sumatoriaCalificaciones(int cal1, int cal2, int cal3){
    // debe devolver la sumatoria de calificaciones
    return cal1 + cal2 + cal3;
  }

  /** Genera el promedio de las calificaciones, recibiendo la sumatoria
  y el numero de unidades
  */
  public double promedio(int sumatoriaCalificaciones, int noUnidades){
    //devuelve el promedio
    return sumatoriaCalificaciones / noUnidades;
  }

  /**Recibe el primedio y retorna si aprobaste o no*/
  public boolean estaAprobado(double promedio){
      //retorna true si aprobo o false si reprobo
      if (promedio >= 6) {
        return true;
      }
      else{
        return false;
      }
  }

  public void esteEsMiMetodo(String nombre){
    System.out.println("Hola "+nombre+" Soy Luis, de la Istmo Americana");
  }

  public static void main(String[] args) {
    Calificaciones c = new Calificaciones();

    int cal1 = 8;
    int cal2 = 9;
    int cal3 = 10;
    int noUnidades = 3;

    int sumatoria = c.sumatoriaCalificaciones(cal1, cal2, cal3);
    System.out.println("sumatoria: " + sumatoria);

    double promedio = c.promedio(sumatoria, noUnidades);

    System.out.println("promedio: " + promedio);

    boolean aprobado = c.estaAprobado(promedio);

    if (c.estaAprobado(promedio)) {
      System.out.println("Aprobó");
    }else{
      System.out.println("Reprobo");
    }
  }

}//termina la clase
