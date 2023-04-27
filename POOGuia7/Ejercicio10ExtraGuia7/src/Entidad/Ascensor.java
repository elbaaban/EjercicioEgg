/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Elba Aban
 */
public class Ascensor {

    private int maximoPisos, pisoActual;

    public Ascensor() {
    }

    public Ascensor(int maximoPisos, int pisoActual) {
        this.maximoPisos = maximoPisos;
        this.pisoActual = pisoActual;
    }

    public int getMaximoPisos() {
        return maximoPisos;
    }

    public void setMaximoPisos(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public void subir() {
        if (pisoActual < maximoPisos) {
            pisoActual++;
        } else {
            System.out.println("Ya se ha alcanzado el piso superior");
        }
    }

    public void bajar() {
        if (pisoActual > 0) {
            pisoActual--;
        } else {
            System.out.println("Ya se ha alcanzado la planta baja");
        }
    }

    public void irA(int n) {
        if (n < 0 || n > maximoPisos) {
            System.out.println("El piso ingresado no existe en el edificio");
        } else {
            while (n != pisoActual) {
                System.out.println(toString());
                if (n > pisoActual) {
                    subir();
                } else if (n < pisoActual) {
                    bajar();
                }
            }
        }
        System.out.println(toString() + "\n");

    }

    @Override
    public String toString() {
        return "Ascensor [pisoActual=" + pisoActual + "]";
    }
}
