/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import Capa_Modelo.Receta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ControladorCmbReceta {
    
    public ArrayList getListaReceta(){
            ArrayList ListaReceta = new ArrayList();
            Receta receta = null;
            PreparedStatement ps;
            ResultSet rs;
            Connection con;
            Conexion cn = new Conexion();

            try {
                String sql = "Select id_receta,descripcion From receta";
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()){

                    receta = new Receta();
                    receta.setId_receta(rs.getInt("id_receta"));
                    receta.setDescripcion(rs.getString("descripcion"));
                    ListaReceta.add(receta);
                }

            } catch (Exception e) {

        }
        return ListaReceta;
        }
    
}
