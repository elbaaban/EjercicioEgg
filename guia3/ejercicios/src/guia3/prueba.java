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
public class prueba {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota = 6;
        while (nota > 0 && nota < 10) {
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
        }
    }
}

