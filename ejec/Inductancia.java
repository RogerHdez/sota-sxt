class Inductancia{

  private double PI = 3.14159;

  public double reactanciaCapacitiva(double frecuencia,double capacitancia ){
    return 1 / (2 * PI * frecuencia * capacitancia);
  }

  public double reactanciaInductiva(double frecuencia, double inductancia){
    return 2 * PI * frecuencia * inductancia;
  }

}
