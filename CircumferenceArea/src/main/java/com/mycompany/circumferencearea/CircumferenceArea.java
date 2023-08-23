
package com.mycompany.circumferencearea;

/*
  @author frank
*/

import javax.swing.JOptionPane;

public class CircumferenceArea {

    public static void main(String[] args) {
        double r = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del radio: "));
        double volumen = 0, area = 0;
        
        area = Math.PI * Math.pow(r, 2);
        volumen = (4 * Math.PI * Math.pow(r, 3)) / 3;
        
        JOptionPane.showMessageDialog(null, 
            "Area - circunferencia:  " + area + 
            "\nVolumen - circunferencia: " + volumen
        );
    }
}
