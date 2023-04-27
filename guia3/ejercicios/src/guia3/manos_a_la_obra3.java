/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class manos_a_la_obra3 {
    //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
    //la nota se pedirá de nuevo hasta que la nota sea correcta.
public static void main (String [] args){
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor de la  nota");
        nota = leer.nextInt();
        while (nota < 1 || nota > 10) {
            System.out.println("Ingrese una nueva nota");
            nota = leer.nextInt();
        }
        if (nota >= 0 || nota <= 10);
        System.out.println("La nota es correcta");
    }
}
