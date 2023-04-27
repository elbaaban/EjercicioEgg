/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class prueba {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número para validar si es primo!");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
            if (contador > 2) {
                break;
            }
        }
        return contador <= 2;
    }
}
