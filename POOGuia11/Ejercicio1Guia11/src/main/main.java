/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package main;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Perro> perro = new ArrayList<>();
        Perro zorro1 = new Perro("lolo", "caniche", 10, 1);
        Perro zorro2 = new Perro("mara", "pitbull", 50, 10);
        List<Persona> persona = new ArrayList<>();
        Persona person1 = new Persona("Elba", "Aban", "lolo", 27, 123);
        Persona person2 = new Persona("Cari", "Aban", "mara", 27, 123);

        perro.add(zorro1);
        perro.add(zorro2);
        persona.add(person1);
        persona.add(person2);
        person1.setPerro(zorro1.toString());
        person2.setPerro(zorro2.toString());
        System.out.println(person1.getPerro());

        showDog(person1);
        showDog(person2);

    }

    public static void showDog(Persona persona) {

        System.out.println("persona: " + persona.getNombre()+ " " + persona.getApellido()+ " " + "Su mascota es: " + persona.getPerro().toString());
    }

}
