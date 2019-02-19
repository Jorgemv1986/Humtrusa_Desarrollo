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
public class Clase_producto {
    Long id_clase;
    String nombre_clase;
    String estado;

    public Clase_producto() {
    }

    public Clase_producto(Long id_clase, String nombre_clase, String estado) {
        this.id_clase = id_clase;
        this.nombre_clase = nombre_clase;
        this.estado = estado;
    }

    public Long getId_clase() {
        return id_clase;
    }

    public void setId_clase(Long id_clase) {
        this.id_clase = id_clase;
    }

    public String getNombre_clase() {
        return nombre_clase;
    }

    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
