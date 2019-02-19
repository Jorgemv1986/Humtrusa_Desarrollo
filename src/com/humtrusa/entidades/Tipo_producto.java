/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.entidades;

/**
 *
 * @author usuario
 */
public class Tipo_producto {
    Long id_tipo;
    String nombre_tipo;
    String estado;

    public Tipo_producto() {
    }

    public Tipo_producto(Long id_tipo, String nombre_tipo, String estado) {
        this.id_tipo = id_tipo;
        this.nombre_tipo = nombre_tipo;
        this.estado = estado;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
