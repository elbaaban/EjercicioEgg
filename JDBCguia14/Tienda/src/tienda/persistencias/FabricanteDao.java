
package tienda.persistencias;


import java.util.ArrayList;
import tienda.entidades.Producto;

import tienda.persistencias.DAO;

public class FabricanteDao extends DAO {

      public ArrayList<Producto> listaProductos() throws Exception {
         try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            Producto p;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
               p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));
                productos.add(p);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
             System.out.println("ERROR lista productos");
            desconectarBase();
            throw e;
        }
    }
     
    public ArrayList<Producto> buscarProductos(String nombre) throws Exception{
        try{
           String sql = "SELECT * FROM producto WHERE nombre like '%" + nombre + "%' ";
            consultarBase(sql);
            Producto p;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                p = new Producto();
                int i = resultado.getInt(0);
                System.out.println("Resultado = " + i);
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));
                productos.add(p);
            }
            desconectarBase();
            return productos; 
            
            
        }catch (Exception e) {
             System.out.println("ERROR buscar productos");
            desconectarBase();
            throw e;
        }      
    }
    
     public ArrayList<Producto> buscarProductosMasBaratos() throws Exception{
        try{
           String sql = " select * from producto order by precio limit 1 ";
            consultarBase(sql);
            Producto p;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));
                productos.add(p);
            }
            desconectarBase();
            return productos; 
            
            
        }catch (Exception e) {
             System.out.println("ERROR buscar productos");
            desconectarBase();
            throw e;
        }      
    }
     
    public void ingresarProducto(Producto p) throws Exception {
        try {
             if (p == null) {
                throw new Exception("Error al ingresar el producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" + p.getNombre() + "'," + p.getPrecio()+ "," + p.getCodigoFabricante() + ")"   ;
            insertarModificarEliminar(sql); 
        }catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    } 
    
    public void ingresarFabricante(Fabricante f) throws Exception {
        try {
             if (f == null) {
                throw new Exception("Error al ingresar el fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + f.getNombre() + "')"   ;
            insertarModificarEliminar(sql);
        }catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void editarProducto(Producto p)throws Exception {
        try {
            if (p == null) {
                throw new Exception("Error al editar el producto");
            }
            String sql = "UPDATE producto set nombre = '" + p.getNombre()+ "', precio = " + p.getPrecio()+ ", codigo_fabricante = " + p.getCodigoFabricante()
                    + " where codigo = " + p.getCodigo() + " "; 
            insertarModificarEliminar(sql);
            
        }catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
