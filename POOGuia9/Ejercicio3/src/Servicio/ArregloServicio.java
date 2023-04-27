/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author Elba Aban
 */
public class ArregloServicio {
       public void inicializarA(double[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 10;
        }
        System.out.println("---------------------------");

    }

    public void Mostrar(double[] A) {
        System.out.println("mostrar Arreglo A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
        }
    }

    public void ordenar(double[] A) {
        System.out.println("*************************ordenar ***********************");
        for (int i = 49; i >= 0; i--) {
            System.out.println(A[i]);

        }

    }

    public void inicializarB(double[] A, double[] B) {
        B = Arrays.copyOfRange(A, 0, 10); //si no pongo esto me va a dar veinte 0,5 y yo quiero solo 10, copia la seccion de un arreglo en otro.
        for (int i = 0; i < 10; i++) {//Esto se deja tal cual el for predeteminado porque nos va a dar hasta el 10
            B[i] = A[i]; //aca le marcamos q los 10 primeros nuemeros de i en B van a ser igual a los 10 primeros de i en A
        }
        System.out.print(Arrays.toString(B) + " ");

        for (int i = 0; i < B.length; i++) {
            B[i] = 0.5;
        }
        System.out.print(Arrays.toString(B) + " ");
    }
}
