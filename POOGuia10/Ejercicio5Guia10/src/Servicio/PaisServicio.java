/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class PaisServicio {

    Pais p1 = new Pais();
    Scanner leer = new Scanner(System.in);
    HashSet<String> conjuntoPais = new HashSet(); // es un conjunto donde no se ingresan cosas repetidaS

    public void cargarPais() {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("ingrese un pais");
            String pais = leer.nextLine();

            System.out.println("desea seguir ingresando alumnos S/N");
            respuesta = leer.next();
            conjuntoPais.add(pais);
            leer.nextLine(); //para el espacio cuando pones el nombre del director y antes el de la pelicula

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrarListaPais() {
        System.out.println("--------");
        System.out.println("la lista de paises");
        for (String mostrar : conjuntoPais) {
            System.out.println("pais: " + mostrar);
        }
    }

    public void ordenarAlfabeticamente() {
        System.out.println("-----");
        ArrayList<String> listaPais = new ArrayList(conjuntoPais);
        Collections.sort(listaPais);
        
        System.out.println("Conjunto de países ordenado alfabéticamente:");
        for (String pais : listaPais) {
            System.out.println(pais);
        }

    }

    public void buscarPaisEliminar() {
        System.out.println("-----");
//        HashSet<String> conjuntoPais = new HashSet();
//        ArrayList<String> listaPais = new ArrayList(conjuntoPais);
        Iterator<String> it = conjuntoPais.iterator();

        System.out.println("que pais desea buscar");
        String buscar = leer.next();
        if (this.conjuntoPais.remove(buscar)) {
            System.out.println("se borro el pais");
        } else{
            System.out.println("no se encontro");
        }
        
//            this.conjuntoPais; //
//            while (it.hasNext()) {
//                if (it.next().equalsIgnoreCase(buscar)) { // si es el pais a buscar se borrra
//                    it.remove();
//                }
//            }
        }
    }

