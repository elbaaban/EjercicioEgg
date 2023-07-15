/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Elba Aban
 */
public class RevolverAgua {
 
    private int posAct, posAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posAct, int posAgua) {
        this.posAct = posAct;
        this.posAgua = posAgua;
    }

    public int getPosAct() {
        return posAct;
    }

    public void setPosAct(int posAct) {
        this.posAct = posAct;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public void llenarRevolver( ) {
        posAct = (int) (Math.random() * 6);
        posAgua = (int) (Math.random() * 6);
    }

    public boolean mojar() {
        return posAct == posAgua; // lo iguala,devuelve true si la posición del agua coincide con la posición actual
    }

    public void siguienteChorro(int posAct) {

        if (posAct == (posAct + 1) / 6) { // si esta en pos 6 y lo / x6 vuelve a la 1

        }
    }
//    if(posact ==6)
//    posactual =1
//           return
//else
//    posactual++
    @Override
    public String toString() {
        return "RevolverAgua{" + "posAct=" + posAct + ", posAgua=" + posAgua + '}';
    }

}
