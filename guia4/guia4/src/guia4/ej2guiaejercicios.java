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
public class ej2guiaejercicios {

    private static Object leer;
//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
//e indique si son mayores o menores de edad. Después de cada persona
//el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
//        int npersonas;
//        System.out.println("Ingrese la cantidad de personas");
//        npersonas = leer.nextInt();
        DatosPersonas( leer);
    }

    public static void DatosPersonas( Scanner leer) {
        String respuesta = "";
//        int contador=0;
        
        do{
            String nombre;
//            contador=contador+1;
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.next();
            int edad;
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            if (edad > 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
//            if (contador==2){
               System.out.println("Desea continuar?");
            respuesta = leer.next();  
//            }
           
        }while(!respuesta.equalsIgnoreCase("No"));
//
} 
}


