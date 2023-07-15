package com.tienda.persistencia;

import com.tienda.entidades.Fabricante;
import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.persistencias.DAO;

public class FabricanteDao extends DAO {

    public void agregar(Fabricante fabricante) {

        try { 
            instarModificarEliminar("insert into fabricante (nombre) values('" + fabricante.getNombre() + "')");
        } catch (Exception ex) {
            Logger.getLogger(FabricanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
