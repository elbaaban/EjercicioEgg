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
public class ej3extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("introduzca el tamaño de los vectores");
        int n = leer.nextInt();
        int[] vector = new int[n];
        relleno(vector);
        mostrar(vector);
    }
    public static void relleno (int vector []){
        for (int i = 0; i < vector.length; i++) {
            vector [i] = (int) (Math.random()*9+1);
        }
    }
     public static void mostrar (int vector []) {
          for (int i = 0; i < vector.length; i++) {
              System.out.println("["+vector[i]+"]");
        }
     }

    }
