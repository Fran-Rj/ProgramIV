
package com.mycompany.printntimes;

/*
  @author frank
*/

import java.util.Scanner;

public class PrintNTimes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa una palabra: ");
        String palabra = sc.nextLine();
        
        System.out.println("\nIngresa un numero: ");
        int numero = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }
        
        System.exit(0);    
    }
}
