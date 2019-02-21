  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.entidades;

import java.math.BigDecimal;

/**
 *
 * @author usuario
 */
public class JoinProductos {
    Long id_producto;
    String nombre;
    BigDecimal precio_compra_referencial;
    BigDecimal precio_compra_ult;
    BigDecimal precio_Vent_A;
    BigDecimal precio_Vent_B;
    BigDecimal precio_Vent_C;
    Long id_clase;
    Long id_tipo;
    Long id_medida;
    Long stock;
    String iva;
    String estado;
    String clase;
    String tipo;
    String medida;

    public JoinProductos() {
    }

    public JoinProductos(Long id_producto, String nombre, BigDecimal precio_compra_referencial, BigDecimal precio_compra_ult, BigDecimal precio_Vent_A, BigDecimal precio_Vent_B, BigDecimal precio_Vent_C, Long id_clase, Long id_tipo, Long id_medida, Long stock, String iva, String estado, String clase, String tipo, String medida) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio_compra_referencial = precio_compra_referencial;
        this.precio_compra_ult = precio_compra_ult;
        this.precio_Vent_A = precio_Vent_A;
        this.precio_Vent_B = precio_Vent_B;
        this.precio_Vent_C = precio_Vent_C;
        this.id_clase = id_clase;
        this.id_tipo = id_tipo;
        this.id_medida = id_medida;
        this.stock = stock;
        this.iva = iva;
        this.estado = estado;
        this.clase = clase;
        this.tipo = tipo;
        this.medida = medida;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio_compra_referencial() {
        return precio_compra_referencial;
    }

    public void setPrecio_compra_referencial(BigDecimal precio_compra_referencial) {
        this.precio_compra_referencial = precio_compra_referencial;
    }

    public BigDecimal getPrecio_compra_ult() {
        return precio_compra_ult;
    }

    public void setPrecio_compra_ult(BigDecimal precio_compra_ult) {
        this.precio_compra_ult = precio_compra_ult;
    }

    public BigDecimal getPrecio_Vent_A() {
        return precio_Vent_A;
    }

    public void setPrecio_Vent_A(BigDecimal precio_Vent_A) {
        this.precio_Vent_A = precio_Vent_A;
    }

    public BigDecimal getPrecio_Vent_B() {
        return precio_Vent_B;
    }

    public void setPrecio_Vent_B(BigDecimal precio_Vent_B) {
        this.precio_Vent_B = precio_Vent_B;
    }

    public BigDecimal getPrecio_Vent_C() {
        return precio_Vent_C;
    }

    public void setPrecio_Vent_C(BigDecimal precio_Vent_C) {
        this.precio_Vent_C = precio_Vent_C;
    }

    public Long getId_clase() {
        return id_clase;
    }

    public void setId_clase(Long id_clase) {
        this.id_clase = id_clase;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public Long getId_medida() {
        return id_medida;
    }

    public void setId_medida(Long id_medida) {
        this.id_medida = id_medida;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    
}
