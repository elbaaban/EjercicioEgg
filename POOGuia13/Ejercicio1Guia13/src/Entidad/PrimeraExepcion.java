
package Entidad;

/**
 *
 * @author Elba Aban
 */
public class PrimeraExepcion {

     private String nombre;
    private int edad;
    
    // Constructor, getters y setters
    
    public void esMayorDaaaaaEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
}
