
package com.mycompany.inputs;

/*
  @author frank
 */

import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Inputs {
    public static void main(String[] args) { 
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingresa tu apellido: ");
       
        LocalDate date = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String fecha = date.format(formato);
       
        String mensaje = String.format(
            "\nNombre: %s %s \nFecha: %s", nombre, apellido,  fecha
        );
       
        JOptionPane.showMessageDialog(null, mensaje);
        System.exit(0);
    }
}
