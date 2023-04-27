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
public class ej4extra {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double[] vector = new double[5];
        int primeraNota = 0;
        int segundoTrabajo = 0;
        int primerIntegrador = 0;
        int segundoIntegrador = 0;
        int aprobado = 0;
        int desaprobado = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del alumno " + (i + 1));
            System.out.println("Introduzca la nota del primer trabajo practico");
            primeraNota = leer.nextInt();

            System.out.println("Introduzca la nota del segundo trabajo practico");
            segundoTrabajo = leer.nextInt();

            System.out.println("Introduzca la nota del primer integrador");
            primerIntegrador = leer.nextInt();

            System.out.println("Introduzca la nota del segundo integrador");
            segundoIntegrador = leer.nextInt();

            vector[i] = 0.1 * primeraNota + 0.15 * segundoTrabajo + 0.25 * primerIntegrador + 0.50 * segundoIntegrador;

            if (vector[i] >= 7) {
                aprobado++;
            } else {
                desaprobado++;
            }
            System.out.println("");
        }
        System.out.println("La cantidad de alumnos aprobado es de " + aprobado);
        System.out.println("La cantidad de alumnos desaprobado es de " + desaprobado);
    }

}
