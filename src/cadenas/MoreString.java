/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author josef
 */
public class MoreString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String variable = "SoTaVeNtO";
        String cake = "fresa";
        
        String fruta = "fresa";
        
        System.out.println(variable);
        
        System.out.println(variable.toUpperCase());//conviete a mayuscula
        
        System.out.println(variable.toLowerCase());//convierte a minuscula
        
        
        if(cake.equalsIgnoreCase(fruta)){
            System.out.println(cake + " es igual a " + fruta);
        }else{
            System.out.println(cake + "es diferente de " + fruta);
        }
        
        if(cake.equals(fruta)){
            System.out.println("---");
        }
        
        String eleazar = "eleazar     ";
        
        System.out.println(eleazar + " es chido");
        
        System.out.println(eleazar.trim() + " es buena onda");
        
        if(eleazar.contains("ele")){
            System.out.println(eleazar.trim() + " contiene 'ele'");
        }else{
            System.out.println("No lo contiene");
        }
        
        System.out.println(eleazar);
        
        if(eleazar.endsWith(" ")){
            System.out.println(eleazar + " termina con 'ar'");
        }else{
            System.out.println("No termina con ");
        }
        
        if(eleazar.isEmpty()){
            System.out.println("vacia");
        }else{
            System.out.println("No vacia");
        }
        
        System.out.println(eleazar.length()); //longitud
    }
    
}
