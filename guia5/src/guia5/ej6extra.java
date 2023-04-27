/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Elba Aban
 */
public class ej6extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        String palabra;
        Random random = new Random();
        int aleatorio, aleatorio2;
        //pide palabras y las ingresa a la matriz
        for (int i = 0; i < 5; i++) {
            aleatorio = random.nextInt(20);

            do {
                System.out.println("Ingresa una palabra de 3 a 5 caracteres");
                palabra = leer.next();
                aleatorio2 = random.nextInt(20 - palabra.length());
            } while (palabra.length() > 5 || palabra.length() < 3);

            for (int j = 0; j < palabra.length(); j++) {
                matriz[aleatorio][j + aleatorio2] = String.valueOf(palabra.charAt(j));
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = String.valueOf(random.nextInt(10));
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

