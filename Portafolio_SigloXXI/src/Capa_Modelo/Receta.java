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
public class Receta {
    int id_receta;
    String descripcion;
    int id_platos;

    public Receta() {
    }

    public Receta(int id_receta, String descripcion, int id_platos) {
        this.id_receta = id_receta;
        this.descripcion = descripcion;
        this.id_platos = id_platos;
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_platos() {
        return id_platos;
    }

    public void setId_platos(int id_platos) {
        this.id_platos = id_platos;
    }

    @Override
    public String toString() {
        return getDescripcion();
    }
    
    
    
}
