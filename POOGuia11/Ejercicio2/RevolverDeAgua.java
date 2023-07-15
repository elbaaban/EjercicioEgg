/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente. Métodos: • llenarRevolver(): le pone
 * los valores de posición actual y de posición del agua. Los valores deben ser
 * aleatorios. • mojar(): devuelve true si la posición del agua coincide con la
 * posición actual • siguienteChorro(): cambia a la siguiente posición del
 * tambor 
 * • toString(): muestra información del revolver (posición actual y
 * 
 * donde está el agua)
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {

    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void llenarRevolver() {

        posicionActual = (int) (Math.random() * 6) + 1;
        posicionAgua = (int) (Math.random() * 6) + 1;
    }

    //mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar() {
        return posicionActual == posicionAgua;

    }

    //siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguenteChorro() {
        if (posicionActual == 6) {

            posicionActual = 1;
            return;
        }
        posicionActual++;
    }
}
