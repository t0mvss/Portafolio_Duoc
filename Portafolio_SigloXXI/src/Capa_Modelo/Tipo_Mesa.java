/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Modelo;

/**
 *
 * @author boris
 */
public class Tipo_Mesa {
    
    int id_tipo_mesa;
    String descripcion;
    int capacidad;

    public Tipo_Mesa() {
    }

    public Tipo_Mesa(int id_tipo_mesa, String descripcion, int capacidad) {
        this.id_tipo_mesa = id_tipo_mesa;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
    }

    public int getId_tipo_mesa() {
        return id_tipo_mesa;
    }

    public void setId_tipo_mesa(int id_tipo_mesa) {
        this.id_tipo_mesa = id_tipo_mesa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    

    @Override
    public String toString() {
        return getDescripcion(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
