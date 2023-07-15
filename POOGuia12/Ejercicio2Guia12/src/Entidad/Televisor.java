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
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del tele");
        double precio = leer.nextDouble();
        System.out.println("Ingresa el color");
        String color = comprobarColor(leer.next());
        System.out.println("Ingresa el peso");
        int peso = leer.nextInt();
        System.out.println("Ingresa el tipo de consumo");
        consumoEnergetico = leer.next().charAt(0);
        System.out.println("ingrese la resolucion");
        int resolucion = leer.nextInt();
        System.out.println("ingrese la sintonizador tdt");
        boolean sintonizadorTDT = leer.nextBoolean();
        this.setColor(color);
        this.setConsumoEnergetico(consumoEnergetico);
        this.setPeso(peso);
        this.setPrecio(precio);
        this.setResolucion(resolucion);
        this.setSintonizadorTDT(sintonizadorTDT);
    }

    @Override
    public double precioFinal() {
        double preciofinal = super.precioFinal();
        if (resolucion >= 40) {
            preciofinal *= 1.3;
        } else {
            if (sintonizadorTDT) {
                preciofinal += 500;
            }

        }
        return preciofinal; 

    }
}
