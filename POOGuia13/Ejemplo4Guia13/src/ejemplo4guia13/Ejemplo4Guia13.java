/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4guia13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class Ejemplo4Guia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            double resultado = (double) numero1 / numero2;

            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese números válidos.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        scanner.close();
    }

}
