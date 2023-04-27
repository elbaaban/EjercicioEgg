/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class Juego {

    private String jugador1, jugador2;
    private int num;
    private int vic1, vic2;

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int num, int vic1, int vic2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.num = num;
        this.vic1 = vic1;
        this.vic2 = vic2;
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getVic1() {
        return vic1;
    }

    public void setVic1(int vic1) {
        this.vic1 = vic1;
    }

    public int getVic2() {
        return vic2;
    }

    public void setVic2(int vic2) {
        this.vic2 = vic2;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1 : Elegir un numero");
        num = leer.nextInt();
        int contador = 0;
        int num2;
        do {
            System.out.println("Jugador 2 : intente adivinar el numero de jugador 1");
            num2 = leer.nextInt();
            if (num2 == num) {
                System.out.println("Felicitaciones usted ganó en el intento n°: " + (contador + 1));
                vic2++;
                break;
            } else {
                if (num2 < num) {
                    System.out.println("Mas alto");
                } else {
                    System.out.println("Mas bajo");
                }

            }
            contador++;

        } while (contador < 10);
        if (contador == 10) {
            System.out.println("Perdiste");
            vic1++;
        }
        System.out.println("Jugador 2 tiene : " + vic2 + " victorias ");
        System.out.println("Jugador 1 tiene : " + vic1 + " victorias ");
    }
}
