/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'F') {
            return letra;

        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "Blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del electrodomestico");
        double precio = leer.nextDouble();
        System.out.println("Ingresa el color");
        String color = comprobarColor(leer.next());
        System.out.println("Ingresa el peso");
        int peso = leer.nextInt();
        System.out.println("Ingresa el tipo de consumo");
        consumoEnergetico = leer.next().charAt(0);
    }

    //Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    public double precioFinal() {
        double preciofinal = this.precio;

        switch (consumoEnergetico) {
            case 'A':
                preciofinal += 1000; // += aumenta 
                break;
            case 'B':
                preciofinal += 800;
                break;
            case 'C':
                preciofinal += 600;
                break;
            case 'D':
                preciofinal += 500;
                break;
            case 'E':
                preciofinal += 300;
                break;
            case 'F':
                preciofinal += 100;
                break;

        }
        if (peso >= 1 && peso <= 19) {
            preciofinal += 100;
        } else {
            if (peso >= 20 && peso <= 49) {
                preciofinal += 500;
            } else {
                if (peso >= 50 && peso <= 79) {
                    preciofinal += 800;
                } else {
                    if (peso >= 80) {
                        preciofinal += 1000;

                    }

                }
            }
        }
        return preciofinal;
    }
}
