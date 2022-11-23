/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import Capa_Modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author boris
 */
public class ControladorCmbProveedores {
    public ArrayList getListaProveedores(){
            ArrayList ListaProveedores = new ArrayList();
            Proveedor prov = null;
            PreparedStatement ps;
            ResultSet rs;
            Connection con;
            Conexion cn = new Conexion();

            try {
                String sql = "Select * From proveedor";
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()){

                    prov = new Proveedor();
                    prov.setId_proveedor(rs.getInt("id_proveedor"));
                    prov.setNombre_proveedor(rs.getString("nombre_proveedor"));
                    prov.setEmail_proveedor(rs.getString("email_proveedor"));
                    ListaProveedores.add(prov);

                }

            } catch (Exception e) {

        }
        return ListaProveedores;
        }
}
