/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;
import static sun.util.calendar.CalendarUtils.mod;

/**
 *
 * @author elbaj
 */
public class ejextra1 {
//Dado un tiempo en minutos, calcular su equivalente en días y horas. 
//Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos, horas, dias;
        System.out.println(" ingrese un tiempo en minutos");
         
        minutos= leer.nextInt();
        
        horas = minutos /60;
        dias = horas / 24;
         horas = horas%24;
        
        System.out.println(minutos + " el equivalente en dias es " + dias + "y  horas es " + horas);
        
        
        
}
}

