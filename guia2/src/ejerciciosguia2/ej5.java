/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ej5 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        int numeroDoble = numero * 2;
        int numeroTriple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("Su doble es: " + numeroDoble);
        System.out.println("Su triple es: " + numeroTriple);
        System.out.println("Su raiz cuadrada es: " + raizCuadrada);
    }
}
