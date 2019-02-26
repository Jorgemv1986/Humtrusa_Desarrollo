/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.entidades;

import java.math.BigDecimal;

/**
 *
 * @author jorge
 */
public class Calcular_totales {
    
    private BigDecimal SubtotalConIva;
    private BigDecimal SubtotalSinIva;
    private BigDecimal Subtotal;
    private BigDecimal Iva;
    private BigDecimal Descuento;
    private BigDecimal Total;

    public Calcular_totales(BigDecimal SubtotalConIva, BigDecimal SubtotalSinIva, BigDecimal Subtotal, BigDecimal Iva, BigDecimal Descuento, BigDecimal Total) {
        this.SubtotalConIva = SubtotalConIva;
        this.SubtotalSinIva = SubtotalSinIva;
        this.Subtotal = Subtotal;
        this.Iva = Iva;
        this.Descuento = Descuento;
        this.Total = Total;
    }

    public Calcular_totales() {
        
    }

    public BigDecimal getSubtotalConIva() {
        return SubtotalConIva;
    }

    public void setSubtotalConIva(BigDecimal SubtotalConIva) {
        this.SubtotalConIva = SubtotalConIva;
    }

    public BigDecimal getSubtotalSinIva() {
        return SubtotalSinIva;
    }

    public void setSubtotalSinIva(BigDecimal SubtotalSinIva) {
        this.SubtotalSinIva = SubtotalSinIva;
    }

    public BigDecimal getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(BigDecimal Subtotal) {
        this.Subtotal = Subtotal;
    }

    public BigDecimal getIva() {
        return Iva;
    }

    public void setIva(BigDecimal Iva) {
        this.Iva = Iva;
    }

    public BigDecimal getDescuento() {
        return Descuento;
    }

    public void setDescuento(BigDecimal Descuento) {
        this.Descuento = Descuento;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public void setTotal(BigDecimal Total) {
        this.Total = Total;
    }
    
    
    
}