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
public class ej5extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("introduzca el tamaño de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];

        //rellena la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("introduzca un numero");
                matriz[i][j] = leer.nextInt();
                suma += matriz[i][j];

            }

        }
        //muestra la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
            System.out.println("");
            System.out.println(" la suma de todos los subindices es " + suma);
        }

    }

}
