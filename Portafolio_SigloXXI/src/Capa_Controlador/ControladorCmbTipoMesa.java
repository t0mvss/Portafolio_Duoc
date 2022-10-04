/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import java.util.ArrayList;
import Capa_Modelo.Tipo_Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author boris
 */
public class ControladorCmbTipoMesa {
    
    public ArrayList getListaTipoMesas(){
        ArrayList ListaTipoMesas = new ArrayList();
        Tipo_Mesa tipoMesa = null;
        PreparedStatement ps;
        ResultSet rs;
        Connection con;
        Conexion cn = new Conexion();
        
        
        try {
            String sql = "Select * From tipo_mesa";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){

                tipoMesa = new Tipo_Mesa();
                tipoMesa.setId_tipo_mesa(rs.getInt("id_tipo_mesa"));
                tipoMesa.setDescripcion(rs.getString("descripcion"));
                tipoMesa.setCapacidad(rs.getInt("capacidad"));
                ListaTipoMesas.add(tipoMesa);

            }
            
        } catch (Exception e) {
          
    }
    return ListaTipoMesas;
    }
}
