
package ej5pooutilidades.service;

import ej5pooutilidades.entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
   Scanner leer = new Scanner(System.in);
  public Persona crearPersona(){
      System.out.println("Ingrese el nombre de la persona");
      String nombre = leer.next();
      System.out.println("Ingrese fecha de nacimiento.  Dia: ");
      int dia = leer.nextInt();
      System.out.println("Mes:");
      int mes = leer.nextInt();
      System.out.println("Año:");
      int anio = leer.nextInt();
      Date fecha = new Date(anio-1900,mes-1,dia);
      return new Persona(nombre,fecha);
  }
   public int calcularEdad(Persona persona){
       Date actual = new Date();
       
       int edad = actual.getYear()-persona.getNacimiento().getYear();
       if (actual.getMonth()<persona.getNacimiento().getMonth()) {
           return(edad-1);
       }else{
           return edad;
       }
   }
   
   public boolean menorQue(Persona persona, int edad){
       if (calcularEdad(persona)<edad) {
           return true;
       }else{
           return false;
       }
   }
   
   public void mostrarPersona(Persona persona){
       System.out.println("Nombre " + persona.getNombre()+ " Edad: " + calcularEdad(persona));
   }
}
