/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ej1 {
    //Crear un programa que dado un número determine si es par o impar.
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num % 2 == 0) {
      //Si el número dividido por 2 su resto NO da 0, entonces:       
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
