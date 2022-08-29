/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;
import Capa_Modelo.Tipo_Usuario;
import Capa_Modelo.Usuario;
import Capa_Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tomas
 */
public class ControladorRegistro {
    
    Connection con;
    Usuario u = new Usuario();
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarUsuario(Usuario u) {
        String sql = "Insert into usuario values(?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getCorreo());
            ps.setString(4, u.getPass());
            
        } catch (Exception e) {
        }
        return false;
    }
    
}
