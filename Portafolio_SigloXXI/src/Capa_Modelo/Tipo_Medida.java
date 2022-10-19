/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Modelo;

/**
 *
 * @author boris
 */
public class Tipo_Medida {
    
    int id_tipo_medida;
    String descripcion;

    public Tipo_Medida() {
    }

    public Tipo_Medida(int id_tipo_medida, String descripcion) {
        this.id_tipo_medida = id_tipo_medida;
        this.descripcion = descripcion;
    }

    public int getId_tipo_medida() {
        return id_tipo_medida;
    }

    public void setId_tipo_medida(int id_tipo_medida) {
        this.id_tipo_medida = id_tipo_medida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return getDescripcion(); //To change body of generated methods, choose Tools | Templates.
    }
}
