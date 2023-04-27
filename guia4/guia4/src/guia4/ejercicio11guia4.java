/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ejercicio11guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();

        System.out.println(cambioCaracter(frase));

    }

    public static String cambioCaracter(String frase) {
        String letra;
        String nuevaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);

            if (letra.equalsIgnoreCase("a")) {
                letra = "@";
            }
            if (letra.equalsIgnoreCase("e")) {
                letra = "#";
            }
            if (letra.equalsIgnoreCase("i")) {
                letra = "$";
            }
            if (letra.equalsIgnoreCase("o")) {
                letra = "%";
            }
            if (letra.equalsIgnoreCase("u")) {
                letra = "*";
            }

            nuevaFrase = nuevaFrase.concat(letra);
        }

        return nuevaFrase;
    }
}

