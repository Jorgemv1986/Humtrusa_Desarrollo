/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.entidades;

/**
 *
 * @author jorge
 */
public class StockVentas {
    
    private Long id_producto;
    private Long cantidad;

    public StockVentas(Long id_producto, Long cantidad) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }

    public StockVentas() {}

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
    
    


    
    
    
}
