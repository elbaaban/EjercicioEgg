/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Elba Aban
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }


     public void alimentacion(){
        System.out.println("el gato come pescado");
    }
    
}
