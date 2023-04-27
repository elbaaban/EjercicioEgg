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
public class ej1guiaejercicios {
//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
//La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextInt();
        System.out.println(" la suma de los dos numeros elegidos :" + sumar(num1, num2));
        System.out.println("la resta de los dos numeros elegidos son :" +  restar(num1, num2));
        System.out.println("la multiplicacion de los dos numeros elegidos son : " + multiplicacion(num1,num2));
        System.out.println("la division de los dos  numeros ejegidos son :" + dividir(num1,num2));
}
  public static int sumar (int num1, int num2)
{ 
    int suma = num1 + num2;
    return suma;
}
public static int restar (int num1, int num2)
{
    int resta;
    resta = num1 - num2;
    return resta;
    
}
public static int multiplicacion  (int num1, int num2)
{
    int multiplicacion;
    multiplicacion = num1 * num2;
    return multiplicacion;
}
public static double dividir (double num1 , double num2)
{
    double dividir;
    dividir = num1 / num2;
    return dividir;
}
         
    
}
