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
public class ej2 {
    //Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
    //sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.next();
        //declarar e inicializar
     if(frase.equals("eureka")){
         System.out.println("correcto");
     }else {
         System.out.println("incorrecto");
     }
    }

}
