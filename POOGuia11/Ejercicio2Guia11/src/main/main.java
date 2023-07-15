/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
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
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        System.out.println("ingrese la cantidad de jugadores de 1 a 6");
        int cantJugadores = leer.nextInt();
        for (int i = 0; i < cantJugadores; i++) {
            jugadores.add(new Jugador(i));//cargamos jugadores
        }

        RevolverAgua revolveragua = new RevolverAgua();
        revolveragua.llenarRevolver();
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolveragua);
        juego.ronda();
    }
}
