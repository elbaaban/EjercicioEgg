/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3guia13;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class Ejercicio3Guia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String numero1Str = leer.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String numero2Str = leer.nextLine();

        try {
            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);

            double resultado = (double) numero1 / numero2;

            System.out.println("El resultado de la división es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Ingrese números válidos.");
        }

        
    }
}
