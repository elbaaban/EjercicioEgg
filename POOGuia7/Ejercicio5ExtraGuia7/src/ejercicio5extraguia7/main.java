/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extraguia7;

import Entidad.Empleado;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado E = new Empleado();
        E.setEdad(35);
        E.setNombre("Omar");
        E.setSalario(50000);
        E.calcular_aumento();
    }
    
}
    
