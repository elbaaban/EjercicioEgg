/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Elba Aban
 */
public class Nif {
    //Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
    //Los atributos serán el número de DNI (entero largo)
    //y la letra (String o char) que le corresponde.
private long Dni;
private char letra;

    public Nif() {
    }

    public Nif(long Dni, char letra) {
        this.Dni = Dni;
        this.letra = letra;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }


}
