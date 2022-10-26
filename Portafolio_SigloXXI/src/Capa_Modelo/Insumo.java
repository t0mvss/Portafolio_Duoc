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
public class Insumo {
    
    int id_insumos;
    String nombre;
    int id_tipo_medida;

    public Insumo() {
    }

    public Insumo(int id_insumos, String nombre, int id_tipo_medida) {
        this.id_insumos = id_insumos;
        this.nombre = nombre;
        this.id_tipo_medida = id_tipo_medida;
    }

    public int getId_insumos() {
        return id_insumos;
    }

    public void setId_insumos(int id_insumos) {
        this.id_insumos = id_insumos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_tipo_medida() {
        return id_tipo_medida;
    }

    public void setId_tipo_medida(int id_tipo_medida) {
        this.id_tipo_medida = id_tipo_medida;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    
    
}
