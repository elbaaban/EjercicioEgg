/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extraguia7;

import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego J = new Juego();
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        do {
            J.iniciar_juego();
            System.out.println("Desea seguir Jugando? S/N ");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("S"));

    }
}
