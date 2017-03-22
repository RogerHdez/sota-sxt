/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carita;

import javax.swing.JFrame;

/**
 *
 * @author josef
 */
public class TestFace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Face carita = new Face();
        JFrame app = new JFrame("CARITA");
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//hace funcional el boton de cerrar
        app.add(carita);
        app.setSize(230, 250);
        app.setVisible(true);
      
    }
    
}
