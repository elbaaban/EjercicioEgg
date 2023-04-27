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
public class ejercicioguia14 {
  
  public static void main(String[] args) {
     // Define el vector de compañeros de equipo
    String[] Equipo = new String[5];
    Scanner leer = new Scanner(System.in);

    // Pedir al usuario que ingrese los nombres
    for (int i = 0; i < 5; i++) {
      System.out.print("Ingrese el nombre del compañero de equipo #" + (i+1) + ": ");
      Equipo[i] = leer.nextLine();
    }

    // Imprime el vector
    for (int i = 0; i < 5; i++) {
      System.out.println(Equipo[i]);
    }
  }
}
