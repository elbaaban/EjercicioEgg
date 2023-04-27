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
public class ej1extra {
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N
  //con los valores ingresados por el usuario.
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int suma =0;
         System.out.println(" introduzca el tamaño del vector ");
         int tamanio = leer.nextInt();
         int [] vector =new int [tamanio];
         for (int i = 0; i < tamanio; i++) {
             System.out.println(" introduzca un numero");
             vector [i] = leer.nextInt();
             suma += vector [i];
            }
         for (int i = 0; i < tamanio; i++) {
             System.out.println("[" + vector +"]");
        }
         System.out.println("");
         System.out.println("la suma de todos los subindices es " + suma);
    }

}
