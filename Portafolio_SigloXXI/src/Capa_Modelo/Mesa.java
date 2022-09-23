/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Modelo;

/**
 *
 * @author boris
 */
public class Mesa {
   
    int id_mesa;
    int capacidad;
    int id_tipo_mesa;

    public Mesa() {
    }

    public Mesa(int id_mesa, int capacidad, int id_tipo_mesa) {
        this.id_mesa = id_mesa;
        this.capacidad = capacidad;
        this.id_tipo_mesa = id_tipo_mesa;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getId_tipo_mesa() {
        return id_tipo_mesa;
    }

    public void setId_tipo_mesa(int id_tipo_mesa) {
        this.id_tipo_mesa = id_tipo_mesa;
    }
    
}
