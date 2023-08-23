
package com.mycompany.topnumber;

/*
  @author frank
*/

import  javax.swing.JOptionPane;

public class TopNumber {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Primer valor: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Tercer valor: "));
        
        if(num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num1);
        }
        else if(num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num2);
        }
        else if (num3 > num1 && num3 > num2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num3);
        }
    }
}
