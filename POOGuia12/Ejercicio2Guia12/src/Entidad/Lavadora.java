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
public class Lavadora extends Electrodomestico {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
    public void crearLavadora() {
        crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del lavarropas");
        double precio = leer.nextDouble();
        System.out.println("Ingresa el color");
        String color = comprobarColor(leer.next());
        System.out.println("Ingresa el peso");
        int peso = leer.nextInt();
        System.out.println("Ingresa el tipo de consumo");
        consumoEnergetico = leer.next().charAt(0);
        System.out.println("ingrese la carga");
        int carga = leer.nextInt();
        this.setCarga(carga);
        this.setColor(color);
        this.setConsumoEnergetico(consumoEnergetico);
        this.setPeso(peso);

    }

    @Override
    public double precioFinal() {
        double preciofinal = super.precioFinal();
        if (carga > 30) {
            preciofinal += 500;
        }
        return preciofinal;
    }
}
