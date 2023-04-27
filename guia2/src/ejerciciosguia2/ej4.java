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
public class ej4 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centígrados que hace");
        double centigrados = leer.nextDouble();
        double F = 32 + (9 * centigrados / 5);
        System.out.println("Los grados convetidos a Fahrenheit " + F);
    }
}
