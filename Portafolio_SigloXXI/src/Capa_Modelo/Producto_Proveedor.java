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
public class Producto_Proveedor {
    
    public int id_producto_proveedor;
    public String descripcion;

    public Producto_Proveedor() {
    }

    public Producto_Proveedor(int id_producto_proveedor, String descripcion) {
        this.id_producto_proveedor = id_producto_proveedor;
        this.descripcion = descripcion;
    }

    public int getId_producto_proveedor() {
        return id_producto_proveedor;
    }

    public void setId_producto_proveedor(int id_producto_proveedor) {
        this.id_producto_proveedor = id_producto_proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
