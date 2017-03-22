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
public class TestString {

    /**
     * @param args the command line arguments
     * Testing the class String with different methods
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "HoLa";
        
        String mayuscula = cadena.toUpperCase();
        String minuscula = cadena.toLowerCase();
        int largo = cadena.length();
        
        System.out.println(mayuscula);
        System.out.println(minuscula);
        System.out.println(largo);
        
        if (cadena.contains("hola")) {//contine
            System.out.println("contiene cadena");
            
        }else{
            System.out.println("No contine la cadena");
        }
        
        if(cadena.isEmpty()){//isEmpty
            System.out.println("Esta vacia la cadena");
        }else{
            System.out.println("No esta vacia la cadena");
        }
        
        if(cadena.equals("hola")){
            System.out.println("igual");
        }else{
            System.out.println("No es igual");
        }
        
    }
    
}
