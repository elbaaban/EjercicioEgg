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
public class ej4 {
//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
//Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”
//en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Substring y equals() de Java.

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase o palabra");
        String letra = leer.next();
        //declarar e inicializar
     if(letra.substring(0,1).equalsIgnoreCase("a")){
         
         System.out.println("correcto");
     }else {
         System.out.println("incorrecto");
     }
    }

}
