/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena c = new Cadena();

    public void MostrarVocal(Cadena frase) {
        int cont = 0;
        for (int i = 0; i < frase.getLongitudFrase(); i++) {
            // for para recorrer cada letra de la cadena de texto. 
            //El bucle recorre desde la posición 0 hasta la longitud de la cadena de text
            switch (frase.getFrase().substring(i, i + 1).toLowerCase()) {
//          //se utiliza el método substring de la clase String para obtener la letra actual.
//          La expresión frase.getFrase().substring(i, i + 1)
////        devuelve una subcadena de la cadena de texto original que contiene solo la letra en la posición actual.
//          toLowerCase() convierte la letra en minúscula, lo que permite compararla con las vocales en minúscula del case del switch.
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    cont++;   
            }
        }
        System.out.println("la cantidad de vocales son: " + cont);
    }

}
//}
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
//Salida: "acnalb asac".
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas 
//veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone 
//la clase con otra nueva frase ingresada por el usuario.
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva
//frase ingresada por el usuario y mostrar la frase resultante.
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
//por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
//y devuelve verdadero si la contiene y falso si no.
