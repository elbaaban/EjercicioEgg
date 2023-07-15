/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import com.sun.javafx.collections.MappingChange.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class Cine {

    private Pelicula peli = new Pelicula("Rocky", "Jonh G.Avildsen", 13);
    Scanner leer = new Scanner(System.in);
    private int PrecioDeEntrada = 1600;
    private String[][] sala = new String[8][6];
    ArrayList<Espectador> ListEspectador = new ArrayList();

    public Cine() {
        peli.setCal(1, 59, 35);
        creaSala();
    }

    public void creaSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][0] = ((8 - i) + "A ");
                sala[i][1] = ((8 - i) + "B ");
                sala[i][2] = ((8 - i) + "C ");
                sala[i][3] = ((8 - i) + "D ");
                sala[i][4] = ((8 - i) + "E ");
                sala[i][5] = ((8 - i) + "F ");

            }
        }
    }

    public void mostrarSalas() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + sala[i][j] + "] ");
            }
            System.out.println("");
        }

    }

    public void crearEspectador() {
        for (int i = 0; i < 48; i++) {
            Espectador espec = new Espectador(("espectador" + i), (int) (Math.random() * 5000 + 100), (int) (Math.random() * 60 + 0));

            if (espec.getEdad() >= peli.getEdadMinima() && espec.getDinero() >= PrecioDeEntrada) {
                ListEspectador.add(espec);
            }

        }
        for (Espectador x : ListEspectador) {
            System.out.println(x);
        }

    }

    public void pelicula() {
        System.out.println(peli);

    }

    public void ubicarEspectador() {
        for (Espectador x : ListEspectador) {
            boolean s = false;
            int f = (int) (Math.random() * 7 + 0);
            int g = (int) (Math.random() * 5 + 0);
            if (sala[f][g].substring(2).equalsIgnoreCase(" ")) {
                sala[f][g] += "x";
            } else {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sala[i][j].substring(2).equalsIgnoreCase(" ")) {
                            sala[i][j] += "x";
                            s = true;
                            break;
                        }

                    }
                    if (s == true) {
                        break;
                    }

                }
            }

        }
    }

    public void menu() {
        int opc;

        System.out.println("       Menu      ");
        System.out.println("Opcion 1 - Pelicula Estreno ");
        System.out.println("Opcion 2 - espectadores ");
        System.out.println("Opcion 3 - Ubicar espectadores  ");
        System.out.println("Opcion 4 - Mostrar Sala");
        System.out.println("Opcion 5 - Salir ");

        opc = leer.nextInt();
        switch (opc) {
            case 1:

                pelicula();
                menu();
                break;
            case 2:
                crearEspectador();
                menu();

                break;
            case 3:
                ubicarEspectador();
                menu();
                break;
            case 4:
                mostrarSalas();
                menu();
                break;
            case 5:
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }
    }
}
