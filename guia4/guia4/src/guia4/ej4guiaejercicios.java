/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class ej4guiaejercicios {
// Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique
//si es o no un número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo
//¿Qué son los números primos?
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número para validar si es primo: ");
        int numero = leer.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    }
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("Ingrese un numero");
//        int numero;
//        int i;
//        numero = leer.nextInt();
//        System.out.println(Numprimo(numero));
//    }
//
//    private static boolean Numprimo(int numero) {
//        boolean primo = true;
//        if (numero == 0 || numero == 1) {
//            primo = false;
//        }
//
//        
//        for (int i=2;i<= (numero); i++) {
//            if(numero % i == 2)
//            {
//                primo = false;
//            }
//            else{
//                    primo=true;
//        }
//
//        }
//        return primo;
//    }




     

