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
public class ej7 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena= " ";
        int correcta=0;
        int incorrecta=0;
        do{
            System.out.println("Ingrese la cadena de caracteres con maximo 5 debe iniciar con x y terminar con o");
            System.out.println("Si desea terminar los procesos debe enviar &&&&");
            cadena = leer.nextLine();
            if (cadena.length()<=5){
                if(cadena.substring(0,1).equalsIgnoreCase("x")||cadena.substring(3,4).equalsIgnoreCase("o") )
                    correcta++;
            }
            else{
                incorrecta++;
                
            }
        }while (!cadena.equals("&&&&"));
        System.out.println("La cantidad de correctas es : " + correcta);
        System.out.println("La cantidad de incorrectas es : " + incorrecta);
    }
      
}
