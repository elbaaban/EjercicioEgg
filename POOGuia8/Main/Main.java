package Guia8Ejercicio3.Main;

import Guia8Ejercicio3.Entidades.Persona;
import Guia8Ejercicio3.Servicios.PersonaService;

public class Main {
    public static void main(String[] args) {
        PersonaService PS = new PersonaService();
        System.out.println("Ingrese la cantidad de personas");
        Persona[] P = new Persona[4];
        int[] arr = new int[5];
        for (int i = 0; i < P.length; i++) {
            P[i] = PS.crearPersona();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < P.length; i++) {
            System.out.println("Datos de la persona " + (i+1));
            P[i].toString();
            switch (PS.calcularIMC(P[i])) {
                case -1:
                    System.out.println("La persona está debajo de su peso ideal");
                    arr[0]++;
                    break;
                case 0:
                    System.out.println("La persona está en su peso ideal");
                    arr[1]++;
                    break;
                case 1:
                    System.out.println("La persona está por encima de su peso ideal");
                    arr[2]++;
                    break;
            }
            if (PS.esMayor(P[i])) {
                System.out.println("La persona es mayor de edad");
                arr[3]++;
            } else {
                System.out.println("La persona es menor de edad");
                arr[4]++;
            }
            System.out.println("\n");
        }
        PS.calcularPorcentajes(arr);
    }
}
