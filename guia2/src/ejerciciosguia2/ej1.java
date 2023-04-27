/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ej1 {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor de dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("El resultado de la suma es: " + suma);
    }
}
