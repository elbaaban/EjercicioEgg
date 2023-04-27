/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ej2 {
     //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    public static void main(String[] args) {
        
    	Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingresa tu nombre");
        String nombre = leer.next();

        System.out.println(nombre);
    	 
    	 
	}
}
