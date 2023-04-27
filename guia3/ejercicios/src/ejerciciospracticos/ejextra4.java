/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ejextra4 {
  // Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num ;
      System.out.println(" ingrese un numero entre 1 y 10");
      num = leer.nextInt();
 if (num < 1 && num >10)
         System.out.println(" el numero es incorrecto ");
 
  
 switch (num){
     case 1: System.out.println("I");
     break;
     case 2: System.out.println("II");
     break;
     case 3: System.out.println("III");
     break;
     case 4:  System.out.println("IV");
     break;
     case 5:
 }
         
    
}
}
