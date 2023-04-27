/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia8;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

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

        for (int i = 0; i < personas.length; i++) {
            personas[i] = personaServ.crearPersona();
        }

        int[] calcularIMC = new int[personas.length];
        boolean[] esMayorDeEdad = new boolean[personas.length];

        for (int i = 0; i < personas.length; i++) {
            calcularIMC[i] = personaServ.calcularIMC(personas[i]);
            esMayorDeEdad[i] = personaServ.esMayorDeEdad(personas[i]);
        }
        System.out.println("Personas ingresadas...");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + (i + 1) + ": Nombre= " + personas[i].getNombre() + ", Edad= " + personas[i].getEdad() + ", Sexo= " + personas[i].getSexo() + ", Nacionalidad= " + personas[i].getNacionalidad()
                    + ", Atura= " + personas[i].getAltura() + ", Peso= " + personas[i].getPeso());
        }

        pesoBajo(calcularIMC);
        pesoAlto(calcularIMC);
        pesoIdeal(calcularIMC);
        mayoresDeEdad(esMayorDeEdad);

    }

    public static void pesoBajo(int[] IMC) {
        int cont = 0;
        for (int i = 0; i < IMC.length; i++) {
            if (IMC[i] == -1) {
                cont++;
            }
        }
        System.out.println("El porcentaje de personas con bajo peso es de " + (((double) cont / IMC.length) * 100) + "%");
    }

    public static void pesoAlto(int[] IMC) {
        int cont = 0;
        for (int i = 0; i < IMC.length; i++) {
            if (IMC[i] == 1) {
                cont++;
            }
        }
        System.out.println("El porcentaje de personas con sobrepeso peso es de " + (((double) cont / IMC.length) * 100) + "%");
    }

    public static void pesoIdeal(int[] IMC) {
        int cont = 0;
        for (int i = 0; i < IMC.length; i++) {
            if (IMC[i] == 0) {
                cont++;
            }
        }
        System.out.println("El porcentaje de personas con peso ideal es de " + (((double) cont / IMC.length) * 100) + "%");
    }

    public static void mayoresDeEdad(boolean[] mayores) {
        int cont = 0;
        for (int i = 0; i < mayores.length; i++) {
            if (mayores[i]) {
                cont++;
            }
        }
        System.out.println("El porcentaje de personas mayores de edad es de " + (((double) cont / mayores.length) * 100) + "%");
    }

}
//PersonaServicio p1 = new PersonaServicio();
//PersonaServicio p2 = new PersonaServicio();
//PersonaServicio p3= new PersonaServicio();
//PersonaServicio p4= new PersonaServicio();
//p1.creaPersona();
//if (p1.esmayordeedad()>= 18){
// System.out.println("es mayor de edad");
//} else System.out.println("es menor de edad");
//
//}//switch (p1.calcularIMC()){
// case0 : ystem.out.println("peso ideal);
//break
// case -1 :ystem.out.println("debajo de su peso");
//break

// case 1 :ystem.out.println("spobrepeso");
//break
//
//p2.creaPersona();
//if (p2.esmayordeedad()>= 18){
// System.out.println("es mayor de edad");
//} else System.out.println("es menor de edad");
//
//}//switch (p2.calcularIMC()){
// case0 : ystem.out.println("peso ideal);
//break

// case -1 :ystem.out.println("debajo de su peso");
//break

// case 1 :ystem.out.println("spobrepeso");
//break


//
//p3.creaPersona();
//if (p3.esmayordeedad()>= 18){
// System.out.println("es mayor de edad");
//} else System.out.println("es menor de edad");
//
//}//switch (p3.calcularIMC()){
// case0 : ystem.out.println("peso ideal);
//break

// case -1 :ystem.out.println("debajo de su peso");
//break

// case 1 :ystem.out.println("spobrepeso");
//break


//
//p4.creaPersona();
//if (p4.esmayordeedad()>= 18){
// System.out.println("es mayor de edad");
//} else System.out.println("es menor de edad");
//
//}//switch (p4.calcularIMC()){
// case0 : ystem.out.println("peso ideal);
//break

// case -1 :ystem.out.println("debajo de su peso");
//break

// case 1 :ystem.out.println("spobrepeso");
//break
//
//
//
//
//
//
//
//
//
//
 