
package com.mycompany.basicoperations;

/*
  @author frank
*/

import javax.swing.JOptionPane;

public class BasicOperations {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Primer numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo numero: "));
        
        double suma, resta, producto, division;
        
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        
        if (num2 != 0) {      
            division = num1 / num2;
            
            JOptionPane.showMessageDialog(null, 
                "Suma: " + suma + "\nResta: " + resta +
                "\nMultiplicación: " + producto + "\nDivisión: " + division 
            );
        }
        else {
            String error = "No se puede dividir entre cero!";
            
            JOptionPane.showMessageDialog(null, 
                "Suma: " + suma + "\nResta: " + resta +
                "\nProducto: " + producto + "\nDivisión: " + error 
            );
        }
    }
}