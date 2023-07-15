/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el
 * juego se trata de un número de jugadores, que, con un revolver de agua, el
 * cual posee una sola carga de agua, se dispara y se moja. Las clases por hacer
 * del juego son las siguientes:
 */
public class Ejercicio2_Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores que desea que participen del juego");
        int cantJugadores = leer.nextInt();

        for (int i = 0; i < cantJugadores; i++) {
            jugadores.add(new Jugador(i)); //se llama jugadores xq mi ArrayList tiene ese nombre del tipo <Jugador>.

        }
        RevolverDeAgua r = new RevolverDeAgua();
        r.llenarRevolver();
        
        Juego partida1 = new Juego();
        partida1.llenarJuego(jugadores, r);
        partida1.ronda();
    }

}
