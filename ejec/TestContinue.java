public class TestContinue{

  public static void main(String[] args) {

    System.out.println("Inicia ciclo");

    for (int i = 0;  i < 6;  i++) {

      if (i == 3) {
        continue;
      }

      System.out.println("imprime i: " + i);
      System.out.println("mensaje");
    }//fin del for
  }

}
