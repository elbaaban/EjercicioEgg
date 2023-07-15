/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Persona;

import java.util.Scanner;
import Entidad.PersonaServicio;
import Entidad.PrimeraExepcion;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio personaServ = new PersonaServicio();
        System.out.println("Ingrese la cantidad de personas a crear");
        Persona[] personas = new Persona[leerValores.nextInt()];

        try {
            Persona personanull = null;
        } catch (Exception e) {
            System.out.println("La persona es null");
        }
    }

}
