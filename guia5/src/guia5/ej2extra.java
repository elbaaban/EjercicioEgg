/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class ej2extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("introduzca el tamaño de los vectores");
        int n = leer.nextInt();
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        for (int i = 0; i < n; i++) {
            vectorA[i] = (int) (Math.random() * 9 + 1);
            vectorB[i] = (int) (Math.random() * 9 + 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("[" + vectorA[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.println("[" + vectorB[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println("no son iguales los vectores");
                break;
            }
        }
    }
}
