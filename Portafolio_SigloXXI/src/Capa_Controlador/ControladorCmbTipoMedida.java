/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import Capa_Modelo.Tipo_Medida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author boris
 */
public class ControladorCmbTipoMedida {

    public ArrayList getListaTipoMedida(){
            ArrayList ListaTipoMedidas = new ArrayList();
            Tipo_Medida tipoMed = null;
            PreparedStatement ps;
            ResultSet rs;
            Connection con;
            Conexion cn = new Conexion();

            try {
                String sql = "Select * From tipo_medida";
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()){

                    tipoMed = new Tipo_Medida();
                    tipoMed.setId_tipo_medida(rs.getInt("id_tipo_medida"));
                    tipoMed.setDescripcion(rs.getString("descripcion"));
                    ListaTipoMedidas.add(tipoMed);

                }

            } catch (Exception e) {

        }
        return ListaTipoMedidas;
        }
    
}
