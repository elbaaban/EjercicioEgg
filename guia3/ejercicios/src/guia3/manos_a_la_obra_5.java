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
public class manos_a_la_obra_5 {
//Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
//e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
         
         num = leer.nextInt();
            
          if (num>=1 && num<=20) {
         System.out.print(num);
        for (int i = 0; i < num; i++) 
          System.out.print(" * ");
      }
             else {
        System.out.print("El numero ingresado en invalido");
        

          }
 }
}


