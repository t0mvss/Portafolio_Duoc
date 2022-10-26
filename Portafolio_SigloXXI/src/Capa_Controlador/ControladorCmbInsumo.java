/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import Capa_Modelo.Insumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ControladorCmbInsumo {
    
    public ArrayList getListaInsumo(){
            ArrayList ListaInsumo = new ArrayList();
            Insumo insumo = null;
            PreparedStatement ps;
            ResultSet rs;
            Connection con;
            Conexion cn = new Conexion();

            try {
                String sql = "Select id_insumos,nombre From insumos";
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()){

                    insumo = new Insumo();
                    insumo.setId_insumos(rs.getInt("id_insumos"));
                    insumo.setNombre(rs.getString("nombre"));
                    ListaInsumo.add(insumo);

                }

            } catch (Exception e) {

        }
        return ListaInsumo;
        }
    
}
