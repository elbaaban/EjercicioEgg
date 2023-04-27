/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class manos_a_la_obra {

    //Implementar un programa que le pida dos números enteros al usuario
    // determine si ambos o alguno de ellos es mayor a 25.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();

        if (num1 > 25) {
            System.out.println(" el numero1   es mayor a 25");
        } else {
            System.out.println("el numero   es menor  a 25");
        }
        if (num2 > 25) {
            System.out.println("el numero es mayor a 25");
        } else {
            System.out.println("el numero es menor a 25");
        }
    }
}
