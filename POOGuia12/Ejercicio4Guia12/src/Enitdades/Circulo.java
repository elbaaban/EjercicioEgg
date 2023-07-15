/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enitdades;

import Interfaces.Calculoformas;

/**
 *
 * @author Elba Aban
 */
public class Circulo implements Calculoformas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Calculoformas.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Calculoformas.PI *(radio*2) ;
    }

}
