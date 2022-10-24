/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Modelo;

/**
 *
 * @author tomas
 */
public class Tipo_Usuario {
    
    
    int id;
    String role_name;

    public Tipo_Usuario() {
        id =0;
        role_name = "";
    }

    public Tipo_Usuario(int id, String role_name) {
        this.id = id;
        this.role_name = role_name;
    }

    public int getId_tipo_usuario() {
        return id;
    }

    public void setId_tipo_usuario(int id) {
        this.id = id;
    }

    public String getDescripción() {
        return role_name;
    }

    public void setDescripción(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return getDescripción(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
