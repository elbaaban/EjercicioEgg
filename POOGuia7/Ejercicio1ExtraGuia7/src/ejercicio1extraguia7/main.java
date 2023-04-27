/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extraguia7;

import Entidad.Cancion;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Cancion C1 = new Cancion();
        C1.setAutor("juan");
        C1.setTitulo("Bailando");
        System.out.println(C1.toString());
    }
    
}
