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
public class ejercicio2 {
//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
//El programa mostrará dónde se encuentra el numero y si se encuentra repetido
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);  //esto hace numeros aleatorios
            System.out.println(vector[i]);

        }
        System.out.println("El numero a buscar será el 10");
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 10) {
                contador = contador + 1;
            }

        }
        System.out.println("La cantidad de numeros 10 que hay es: " + contador);
         for (int i = 0; i < vector.length; i++) {
            if (tam == vector[i]) {

                System.out.println("se encontro el valor en la posicion: " + i);
            }
    
    }
    }
}




        
//        Scanner leer = new Scanner(System.in);
//
//        int[] vec = new int[100];
//
//        for (int i = 0; i < vec.length; i++) {
//            vec[i] = (int) (Math.random() * 100);
//
//        }
//
//        for (int i = 0; i < vec.length; i++) {
//            System.out.print(vec[i] + " - ");
//
//        }
//        System.out.println("");
//        System.out.println("Valor a buscar:");
//
//        int valor = leer.nextInt();
//
//        for (int i = 0; i < vec.length; i++) {
//            if (valor == vec[i]) {
//
//                System.out.println("se encontro el valor en la posicion: " + i);
//            }
//
//        }
//    }
    
        
    
//    Scanner leer = new Scanner(System.in);
//    Random random = new Random();
//
//    // Pedir al usuario el tamaño del vector
//    System.out.print("Ingrese el tamaño del vector: ");
//    int N = leer.nextInt();
//
//    // Crear el vector y llenarlo con valores aleatorios
//    int[] vector = new int[N];
//    for (int i = 0; i < N; i++) {
//      vector[i] = random.nextInt(100); // Generar valores aleatorios entre 0 y 99
//    }
//
//    // Pedir al usuario el número a buscar
//    System.out.print("Ingrese el número a buscar: ");
//    int numero = leer.nextInt();
//
//    // Buscar el número en el vector
//    boolean encontrado = false;
//    int posicion = -1;
//    int contador = 0;
//    for (int i = 0; i < N; i++) {
//      if (vector[i] == numero) {
//        if (encontrado) {
//          System.out.println("El número se encuentra repetido.");
//        }
//        encontrado = true;
//        posicion = i;
//        contador++;
//      }
//    }
//
//    // Mostrar los resultados
//    if (encontrado) {
//      System.out.println("El número " + numero + " se encuentra en la posición " + posicion + " del vector.");
//      System.out.println("El número se encontró " + contador + " veces en el vector.");
//    } else {
//      System.out.println("El número " + numero + " no se encuentra en el vector.");
//    }
//  }




    

