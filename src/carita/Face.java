/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carita;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author josef
 */
public class Face extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
//        dibujar cara
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);
        
//        dibujar ojos
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
//        dibujar boca
        g.fillOval(50, 110, 120, 60);
        
//        hace la sonrisa
        g.setColor(Color.YELLOW);
        g.fillRect(50,110, 120, 30);
        g.fillOval(50, 120, 120, 40);
        
    }
    
}
