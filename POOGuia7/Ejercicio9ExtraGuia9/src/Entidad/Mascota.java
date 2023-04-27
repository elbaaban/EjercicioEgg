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
//Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
//Crea un constructor para inicializar los valores de las propiedades y un método para mostrar
//por pantalla la información de la mascota.
//Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
public class Mascota {

    private String nombre, raza, tipo;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, String tipo, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int cumpliranios() {
        return ++edad; //retorna edad acumulada 
    }
}
