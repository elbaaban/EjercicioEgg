package Guia8Ejercicio3.Servicios;

import java.util.Scanner;

import Guia8Ejercicio3.Entidades.Persona;

public class PersonaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String nombre = leer.next();

        System.out.println("Ingrese sexo");
        System.out.println("Opciones H-M-O");
        String sexo = leer.next();
        while ((!sexo.equalsIgnoreCase("h")) 
        && (!sexo.equalsIgnoreCase("m")) 
        && (!sexo.equalsIgnoreCase("o"))) {
            System.out.println(sexo);
            System.out.println("El sexo ingresado no corresponde, ingreselo nuevamente");
            System.out.println("Opciones H-M-O");
            sexo = leer.next();
        }

        System.out.println("Ingrese edad");
        int edad = leer.nextInt();

        System.out.println("Ingrese altura en mts");
        double altura = leer.nextDouble();

        System.out.println("Ingrese peso en kgs");
        double peso = leer.nextDouble();

        return new Persona(nombre, sexo, edad, altura, peso);
    }

    public boolean esMayor(Persona p) {
        return p.getEdad() >= 18;
    }

    public int calcularIMC(Persona p) {
        if ((p.getPeso()/(Math.pow(p.getAltura(), 2))) < 20) {
            return -1;
        }
        if ((p.getPeso()/(Math.pow(p.getAltura(), 2))) >= 20
        || (p.getPeso()/(Math.pow(p.getAltura(), 2))) <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public void calcularPorcentajes(int[] arr) {
        System.out.println("El porcentaje de personas debajo de su peso ideal es: " + (arr[0]/4*100) + "%");
        System.out.println("El porcentaje de personas en su peso ideal es: " + (arr[1]/4*100) + "%");
        System.out.println("El porcentaje de personas por encima de su peso ideal es: " + (arr[2]/4*100) + "%");
        System.out.println("El porcentaje de personas mayores de edad es: " + (arr[3]/4*100) + "%");
        System.out.println("El porcentaje de personas menores de edad es: " + (arr[4]/4*100) + "%");
    }
}
