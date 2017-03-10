public class Operadores  {

  public static void main(String[] args) {
      int edad = 65;
      int genero = 1;

      if ((edad == 65) && ( genero == 1)) {
        System.out.println("edad = 65 AND genero = 1 ");
        System.out.println("edad: " + edad);
        System.out.println("genero: " + genero);

      }

      System.out.println("--------------------");

      if ((edad == 65) || ( genero == 2)) {
        System.out.println("edad = 65 OR genero = 2 ");
        System.out.println("edad: " + edad);
        System.out.println("genero: " + genero);
      }

      System.out.println("--------------------");

      if (!(edad == 50) && true) {
        System.out.println("si la edad es diferente de 50");
        System.out.println("edad: " + edad);
        System.out.println("genero: " + genero);
      }
      System.out.println("----------++++++");
      // if ( (genero == 1) & (++edad >= 65) ) {
      //   System.out.println("entro");
      //   System.out.println(edad);
      // }
  }
}
