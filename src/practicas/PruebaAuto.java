/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import javafx.scene.paint.Color;

/**
 *
 * @author josef
 */
public class PruebaAuto {

    /** SOLID
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto vocho = new Auto(); // instancia de Auto
        
        Auto auto = new Auto();//instacia de un auto
        
        System.out.println(auto.getColor());
        
        auto.setColor("AMARILLO HUEVO");
        
        System.out.println(auto.getColor());
        
        System.out.println(auto.getModelo());
     
        auto.setModelo(2018);
        
        System.out.println(auto.getModelo());
        
        Auto combi =  new Auto("vw", ColorAuto.NAYELY);
        
        System.out.println(combi.getColor());
       
        combi.setColor("rosa bebe");
        
        System.out.println(combi.getColor());

        Auto puingDurmiendo = new Auto("SOTAVENTO", new ColorAuto());
  
        System.out.println(puingDurmiendo.colorAutoD());
      
        Auto autoNuevo = new Auto("MI AUTO", Color.AQUA);
        System.out.println(autoNuevo.getColorJ().getGreen());
        
                
    }
  
}


