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
public class ej3 {
 //Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
 //Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”
//en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función length() en Java.

      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase o palabras");
        String frase = leer.next();
        //declarar e inicializar
     if (frase.length() == 8){
         System.out.println("correcto");
     }else {
         System.out.println("incorrecto");
     }
    }
}
