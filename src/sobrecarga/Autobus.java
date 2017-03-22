/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author josef
 */
public class Autobus {
    
    private String name;
    private int model;
    private String brand;
    
    /*Sobrecarga de metodos*/

    public Autobus() {        
    }

    public Autobus(String name, int model, String brand) {
        this.name = name;
        this.model = model;
        this.brand = brand;
    }

    public Autobus(String name, int model) {
        this.name = name;
        this.model = model;
    }
    /*--------------------*/
    public void acelerar(){
        System.out.println("Acelere en 1");
    }
   
    public void acelerar(int aceleramiento){
        System.out.println("Acelera en " + aceleramiento);
    }
    
    public void acelerar(String acelerar){
        System.out.println("Acelera en " + acelerar);
    }
    /*-----------------------*/
    
    public String parar(){
        return "me detengo";
    }
    
    public int parar(int stop){
        return 10 - stop;
    }
    
    public String parar(double a, String mensaje){
        return mensaje + " detiene en " + String.valueOf(a);
    }
    
    /*----------------------------*/
    public double suma(double x, double y){
        return x + y;
    }
    
    public double suma(double x, double y, double z){
        return x + y + z;
    }
}
