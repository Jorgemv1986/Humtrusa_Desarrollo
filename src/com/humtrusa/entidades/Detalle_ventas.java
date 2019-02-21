/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.entidades;

import java.math.BigDecimal;

/**
 *
 * @author alumno
 */
public class Detalle_ventas {

    private Long id_detalle_venta;
    private Long id_cabecera_venta;
    private Long id_producto;
    private BigDecimal precio_venta;
    private int cantidad;
    private BigDecimal iva;
    private BigDecimal descuento;
    private BigDecimal total;

    public Detalle_ventas() {
    }

    public Detalle_ventas(Long id_detalle_venta, Long id_cabecera_venta, Long id_producto, BigDecimal precio_venta, int cantidad, BigDecimal iva, BigDecimal descuento, BigDecimal total) {
        this.id_detalle_venta = id_detalle_venta;
        this.id_cabecera_venta = id_cabecera_venta;
        this.id_producto = id_producto;
        this.precio_venta = precio_venta;
        this.cantidad = cantidad;
        this.iva = iva;
        this.descuento = descuento;
        this.total = total;
    }

    public Long getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(Long id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public Long getId_cabecera_venta() {
        return id_cabecera_venta;
    }

    public void setId_cabecera_venta(Long id_cabecera_venta) {
        this.id_cabecera_venta = id_cabecera_venta;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public BigDecimal getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(BigDecimal precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    
    

    
}
