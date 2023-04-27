
package ej5pooutilidades;

import ej5pooutilidades.entidad.Persona;
import ej5pooutilidades.service.PersonaService;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        ps.mostrarPersona(persona);
        System.out.println("Ingrese una edad a comparar");
        System.out.println("La persona es menor que la edad que ingresamos: " + ps.menorQue(persona, leer.nextInt()) );  
    }
     }
  