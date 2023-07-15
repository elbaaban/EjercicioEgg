/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.persistencia;

import com.jdbc.entidades.Producto;
import com.jdbc.services.ProductoService;

/**
 *
 * @author crist
 */
public final class ProductoDAO extends DAO {

    private final ProductoService productoS;

    public ProductoDAO() {
        this.productoS = new ProductoService();
    }

    public ProductoDAO(ProductoService productoS) {
        this.productoS = productoS;
    }

    public void mostrarproducto(Producto pr) throws Exception {
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            Producto np = null;
            while (resultado.next()) {
                np = new Producto();
                np.setNombre(resultado.getString("nombre"));

                System.out.println(np.getNombre());
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante) "
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "','" + producto.getPrecio() + "' ,'" + producto.getCodigoFabricante() + "' );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + " nombre = '" + producto.getNombre() + "' , precio = '" + producto.getPrecio()
                    + " WHERE codigo = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE id = " + codigo + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void nombreyprecio(String s) throws Exception {
        try {
            String sql = "Select nombre, precio from Producto";
            consultarBase(sql);
            Producto p = null;
            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString("nombre"));
                p.setPrecio(resultado.getInt("precio"));

                System.out.println("nombre = " + p.getNombre() + " precio = " + p.getPrecio());
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void PrecioEntre() throws Exception {
        try {
            String sql = "SELECT nombre , precio FROM producto where precio between 120 and 202";
            consultarBase(sql);
            Producto np = null;
            while (resultado.next()) {
                np = new Producto();
                np.setNombre(resultado.getString("nombre"));

                np.setPrecio(resultado.getInt("precio"));

                System.out.println("nombre = " + np.getNombre() + " precio = " + np.getPrecio());
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void portatil() throws Exception {
        try {
            String sql = "Select * from Producto where nombre like '%portátil%'";
            consultarBase(sql);
            Producto p = null;
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt("codigo"));
                p.setNombre(resultado.getString("nombre"));
                p.setPrecio(resultado.getInt("precio"));
                p.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                System.out.println("codigo = " + p.getCodigo() + " nombre = " + p.getNombre() + " precio = " + p.getPrecio() + " Codigo fabricante = " + p.getCodigoFabricante());
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
       public void nypDeProductoMasBarato() throws Exception {
        try {
            String sql = "Select nombre, precio from Producto where precio order by precio  limit 1";
            consultarBase(sql);
            Producto p = null;
            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString("nombre"));
                p.setPrecio(resultado.getInt("precio"));

                System.out.println("nombre = " + p.getNombre() + " precio = " + p.getPrecio());
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}
