
package com.mycompany.rectangleare;

/*
  @author frank
*/

import javax.swing.JOptionPane;

public class RectangleAre {

    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Base del rectangulo: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura del rectangulo: "));
        
        int perimetro = 0, area = 0;
        
        perimetro = 2 * (base + altura);
        area = base * altura;
        
        JOptionPane.showMessageDialog(null, 
            "Perimetro - rectangulo:  " + perimetro +
            "\nArea - rectangulo:  " + area
        );
    }
}
