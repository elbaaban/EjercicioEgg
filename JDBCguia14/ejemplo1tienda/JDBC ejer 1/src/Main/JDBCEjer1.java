/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import com.jdbc.entidades.Producto;
import com.jdbc.persistencia.ProductoDAO;
import com.jdbc.services.ProductoService;

/**
 *
 * @author crist
 */
public class JDBCEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ProductoService ps = new ProductoService();
 // ps.mostrarproducto();
 // ps.listaDeProducto();
 //ps.precio();
 //ps.portatil();
// ps.productoBarato();
 Producto p  = new Producto(13, "kingstone 3.0 Sata", 12.00, 1);
ps.guardarProducto(p);
    }
    
}
