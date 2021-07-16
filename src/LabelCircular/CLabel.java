/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabelCircular;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.AbstractBorder;
/**
 *

 */

    public class CLabel extends JLabel {// su clase padre es JLabel por ello tiene los mismos atributos y eventos de un JLabel

   private AbstractBorder BordeCircular = new BordeCircular();       
   private int lineaBorde=1; 
   private Color lineaColor= Color.BLACK;

    /** Constructor */
     public CLabel()
     {
        Dimension d = new Dimension(100,100);
        setSize(d);
        setPreferredSize(d);       
        setText("CLabel");
        setOpaque(true);
        setHorizontalAlignment(CENTER);       
        setVisible(true);       
        setBorder(BordeCircular); 
     }

    // regresa el color del borde Color de borde
    public Color getLineColor() {
        return lineaColor;
    }
 // define el color del borde 
    public void setLineColor(Color color) {
        BordeCircular = new BordeCircular(color, lineaBorde);
        lineaColor = color;
        setBorder(BordeCircular); 
    }

    // regresa elGrosor de borde
    public int getLineBorder() {
        return lineaBorde;        
    }
//define el  groso del borde 
    public void setLineBorder(int grosor) {
        BordeCircular = new BordeCircular(lineaColor, grosor);
        this.lineaBorde = grosor;        
        setBorder(BordeCircular); 
    }
}
