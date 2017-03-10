
public class LeyOhm{

public LeyOhm(){/*constructor*/}//constructor vacío


/**Calculo de corriente */
public double corriente(double voltaje, double resistencia){
  double resultado = voltaje/resistencia;
  return resultado;
}

/**Calculo de resistencia*/
public double resistencia(double voltaje, double corriente){
  return voltaje/corriente;
}

/**Calculo de voltaje*/
public double voltaje(double corriente, double resistencia){
  return corriente * resistencia;
}


}//fin de la clase
