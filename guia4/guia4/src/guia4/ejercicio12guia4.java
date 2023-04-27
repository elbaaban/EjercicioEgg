/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ejercicio12guia4 {

    /**
     * @param args the command line arguments
     */
 //Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario
 //validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo
  //sino informe que no lo son.
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("ingresa dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        Esmultiplo(num1, num2);
    }

    public static void Esmultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("el primer numero es multplo");
        } else {
            System.out.println("el primer numero no es multiplo");
        }
     

    }
    
}

       
    
    

