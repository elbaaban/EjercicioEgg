/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class Juego {

    private Jugador jugador;
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolveragua;

    public Juego() {
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua revolveragua) {
        this.jugadores = jugadores;
        this.revolveragua = revolveragua;

    }

    public void ronda() {
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("jugador: " + (i + 1));
            precioneEnter();
            jugadores.get(i).disparo(revolveragua);
            if (jugadores.get(i).isMojado()) {
                System.out.println("el jugador perdiio!!!!  " + (i+1) + " se mojo ");
                break;  //del for
            }
            System.out.println("safaste, estaba seco");
        }
    }

    public void precioneEnter() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("precione enter para disparatr");
        leer.nextLine();
    }
}
