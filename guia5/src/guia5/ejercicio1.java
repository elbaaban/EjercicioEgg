/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Elba Aban
 */
public class ejercicio1 {
//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 public static void main(String[] args) {
    // Define el vector de 100 enteros
    int[] numeros = new int[100];

    // Llenar el vector con los primeros 100 enteros
    for (int i = 0; i < 100; i++) {
      numeros[i] = i+1;
    }

    // Mostrar los números en orden descendente y los recorre
    for (int i = 100 -1; i >= 0; i--) {
      System.out.println(numeros[i]);
    }
  }
}
