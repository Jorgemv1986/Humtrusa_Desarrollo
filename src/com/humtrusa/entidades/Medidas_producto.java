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
public class Medidas_producto {
    Long id_medida;
    String nombre_medida;
    String estado;

    public Medidas_producto() {
    }

    public Medidas_producto(Long id_medida, String nombre_medida, String estado) {
        this.id_medida = id_medida;
        this.nombre_medida = nombre_medida;
        this.estado = estado;
    }

    public Long getId_medida() {
        return id_medida;
    }

    public void setId_medida(Long id_medida) {
        this.id_medida = id_medida;
    }

    public String getNombre_medida() {
        return nombre_medida;
    }

    public void setNombre_medida(String nombre_medida) {
        this.nombre_medida = nombre_medida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
