/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;
import Capa_Modelo.Usuario;
import Capa_Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tomas
 */
public class DevolverPassEncripted {
    
    Connection con;
    Usuario u = new Usuario();
    private PreparedStatement ps;
    private ResultSet rs;
    private static final Conexion CONEXION = Conexion.obtenerEstadoConexion();
    public Usuario GetUsuario(Object key) {
        Usuario u = null;
        String sql = "SELECT * FROM usuario WHERE username = ?";
         try {

            ps = CONEXION.getConexion().prepareStatement(sql);
            ps.setString(1, (String) key);
            rs = ps.executeQuery();
            if(rs.next())
            {
                u = new Usuario(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
            }
        } catch (SQLException e) {
            return null;
        }
         finally
        {
            CONEXION.cerrarConexion();
        }
        //System.out.println(mUsuario);
        return u;
    }   
}
    

