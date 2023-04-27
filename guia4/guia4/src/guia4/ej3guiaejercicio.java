/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class ej3guiaejercicio {
//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda
//estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros
//la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor
//mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double euros = scanner.nextDouble();
        System.out.print("Introduce la moneda a la que deseas convertir (dólares, yenes o libras): ");
        String moneda = scanner.next();
        ConvertirAeuros(euros, moneda);
    }

    public static void ConvertirAeuros(double euros, String moneda) {
//        int  opcion;
//        Scanner scanner = new Scanner(System.in);
//        opcion=leer.nextInt();
       moneda=moneda.toUpperCase();
        switch (moneda) {
            case "L":
                 System.out.println(euros * 1.28);
                break;
            case "Y":
                System.out.println(euros * 129.852); 
                break;
            case "D":
                System.out.println(euros * 0.86); 
                break;
        }

    }
}
