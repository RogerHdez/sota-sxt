public class TestBreak{

  public static void main(String[] args){

    for (int i = 0; i <5 ; i++) {
      System.out.println("primer for " + i);

      for (int j = 0; j<5 ;j++ ) {
        System.out.println("segundo for " + j);
        if (j == 2) {
          System.out.println("break j == 2, rompo segundo for ");
          break;
        }
      }
    }//termina el for

  }

}
