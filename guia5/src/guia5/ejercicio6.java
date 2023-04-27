/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class ejercicio6 {
    public static void main(String[] args) {

      int[][] matriz = new int[3][3];
        int diagonales = 0, filas = 0, columna = 0, cont = 0;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese un numero para columna " + i + " y fila " + j);
                matriz[i][j] = leer.nextInt();
                filas += matriz[0][j];
                columna += matriz[i][0];

                if (filas == columna) {
                    cont++;
                }

            }

        }
        if (cont >= 3) {
            System.out.println("la matriz es magica");
        } else {
            System.out.println("la matriz no es magica");
        }
    }
}
//
//public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner leer = new Scanner (System.in);
//    int [][] matriz = new int [3][3];
//    int numero;
//    int diagonal = 0;
//    int fila = 0;
//    int columna = 0;
//    boolean bandera = true;
//            
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                do{
//                    System.out.println("Introduzca un numero (1 al 9)");
//                    numero = leer.nextInt(); 
//                }while(numero < 1 || numero > 9); 
//                
//                matriz [i][j] = numero;
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("["+matriz[i][j]+"]");
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (i == j){
//                diagonal+= matriz[i][j]; 
//                }
//            }
//            
//        }
//        for (int i = 0; i < 3; i++) {
//            fila = 0;
//            columna = 0;
//            for (int j = 0; j < 3; j++) {
//                fila+= matriz [i][j];
//                columna+= matriz [j][i];                 
//             } 
//            if (fila != diagonal || columna != diagonal){
//                bandera = false;
//            }  
//        }
//    if (bandera == true){
//        System.out.println("Es magica");
//    }else{
//        System.out.println("No es magica");
//    }    
//    }

