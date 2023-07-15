/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Elba Aban
 */
public class Espectador {
    private String nombre;
    private float Dinero ;
    private int edad;

    public Espectador(String nombre, float Dinero, int edad) {
        this.nombre = nombre;
        this.Dinero = Dinero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDinero() {
        return Dinero;
    }

    public void setDinero(float Dinero) {
        this.Dinero = Dinero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", Dinero=" + Dinero + ", edad=" + edad + '}';
    }
    
}
