/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class RazaServicio {
   

    public void crearRaza() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razaPerros = new ArrayList();

        char respuesta;

        do {
            System.out.print("Ingrese la raza de perro: ");
            razaPerros.add(leer.next());
            System.out.println("Continuar ingresando razas de perros o salir? S/N");
            respuesta = Character.toLowerCase(leer.next().charAt(0));
        } while (respuesta == 's');

        for (String var : razaPerros) {
            System.out.println(var);
        }
    }
}
