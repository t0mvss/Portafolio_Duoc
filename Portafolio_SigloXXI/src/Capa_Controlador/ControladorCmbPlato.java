/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import Capa_Modelo.Plato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ControladorCmbPlato {
    
    public ArrayList getListaPlato(){
            ArrayList ListaPlato = new ArrayList();
            Plato plato = null;
            PreparedStatement ps;
            ResultSet rs;
            Connection con;
            Conexion cn = new Conexion();

            try {
                String sql = "Select id,name From plato";
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()){

                    plato = new Plato();
                    plato.setId(rs.getInt("id"));
                    plato.setName(rs.getString("name"));
                    ListaPlato.add(plato);

                }

            } catch (Exception e) {

        }
        return ListaPlato;
        }
    
}
