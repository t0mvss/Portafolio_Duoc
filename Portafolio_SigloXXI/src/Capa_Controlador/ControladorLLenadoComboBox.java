/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import java.util.ArrayList;
import Capa_Modelo.Tipo_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author tomas
 */
public class ControladorLLenadoComboBox {
    
    public ArrayList getListaTipoUsuarios(){
        ArrayList ListaTipoUsuarios = new ArrayList();
        Tipo_Usuario tipoUsuario = null;
        PreparedStatement ps;
        ResultSet resultset;
        Connection con;
        Conexion cn = new Conexion();
        
        
        try {
            String sql = "Select * From tipo_usuario where descripcion != 'Cliente' and descripcion != 'Administrador'";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            resultset = ps.executeQuery();

            while (resultset.next()){

                tipoUsuario = new Tipo_Usuario();
                tipoUsuario.setId_tipo_usuario(resultset.getInt("id_tipo_usuario"));
                tipoUsuario.setDescripción(resultset.getString("descripcion"));
                ListaTipoUsuarios.add(tipoUsuario);


            }
            
        } catch (Exception e) {
        
        }
        return ListaTipoUsuarios;
    }
}
