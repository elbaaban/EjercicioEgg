/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Elba Aban
 */
public class Jugador {

    private RevolverAgua revolveragua;
    private int id;
    private String nombre;
    boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "jugador " + id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public RevolverAgua getRevolveragua() {
        return revolveragua;
    }

    public void setRevolveragua(RevolverAgua revolveragua) {
        this.revolveragua = revolveragua;
    }

    @Override
    public String toString() {
        return "Jugador{" + "revolveragua=" + revolveragua + ", id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

//   disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    public boolean disparo(RevolverAgua revolveragua) {

        if (revolveragua.mojar()) {
            mojado = true;
            revolveragua.llenarRevolver();
        } else {
            revolveragua.siguienteChorro(id);
        }
        return mojado;
    }
}
