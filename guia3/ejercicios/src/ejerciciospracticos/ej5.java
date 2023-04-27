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
public class ej5 {
//Escriba un programa en el cual se ingrese un valor límite positivo
//y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int limite = leer.nextInt();
        int numero =0;
        int suma = numero;
        
        while (suma <= limite) {
            System.out.println(" ingrese un numero");
            numero =  leer.nextInt();
            suma = suma + numero;
        }
            
            System.out.println("la suma" + suma + " supera el limete");
        }
        
}
