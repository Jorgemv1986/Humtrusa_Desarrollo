/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.entidades;

import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author alumno
 */
public class Join_Cabecera_ventas {
    
    private Long id_cabecera_venta;
    private String mun_venta;
    private Long id_cliente;
    private Long id_usuario;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String correo;
    private Long id_empresa;
    private Date fecha_venta;
    private String forma_de_pago;
    private String tipo_de_venta;
    private BigDecimal subtotal_con_iva;
    private BigDecimal subtotal_sin_iva;
    private BigDecimal subtotal_no_obj_iva;
    private BigDecimal subtotal_exento_iva;
    private BigDecimal subtotal_venta;
    private BigDecimal ice_venta;
    private BigDecimal descuento_venta;
    private BigDecimal iva_venta;
    private BigDecimal total_venta;
    private BigDecimal utilidad;
    private String estado;

    public Join_Cabecera_ventas() {
    }

    public Join_Cabecera_ventas(Long id_cabecera_venta, String mun_venta, Long id_cliente, Long id_usuario, String cedula, String nombres, String apellidos, String telefono, String direccion, String correo, Long id_empresa, Date fecha_venta, String forma_de_pago, String tipo_de_venta, BigDecimal subtotal_con_iva, BigDecimal subtotal_sin_iva, BigDecimal subtotal_no_obj_iva, BigDecimal subtotal_exento_iva, BigDecimal subtotal_venta, BigDecimal ice_venta, BigDecimal descuento_venta, BigDecimal iva_venta, BigDecimal total_venta, BigDecimal utilidad, String estado) {
        this.id_cabecera_venta = id_cabecera_venta;
        this.mun_venta = mun_venta;
        this.id_cliente = id_cliente;
        this.id_usuario = id_usuario;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.id_empresa = id_empresa;
        this.fecha_venta = fecha_venta;
        this.forma_de_pago = forma_de_pago;
        this.tipo_de_venta = tipo_de_venta;
        this.subtotal_con_iva = subtotal_con_iva;
        this.subtotal_sin_iva = subtotal_sin_iva;
        this.subtotal_no_obj_iva = subtotal_no_obj_iva;
        this.subtotal_exento_iva = subtotal_exento_iva;
        this.subtotal_venta = subtotal_venta;
        this.ice_venta = ice_venta;
        this.descuento_venta = descuento_venta;
        this.iva_venta = iva_venta;
        this.total_venta = total_venta;
        this.utilidad = utilidad;
        this.estado = estado;
    }

    public Long getId_cabecera_venta() {
        return id_cabecera_venta;
    }

    public void setId_cabecera_venta(Long id_cabecera_venta) {
        this.id_cabecera_venta = id_cabecera_venta;
    }

    public String getMun_venta() {
        return mun_venta;
    }

    public void setMun_venta(String mun_venta) {
        this.mun_venta = mun_venta;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public String getTipo_de_venta() {
        return tipo_de_venta;
    }

    public void setTipo_de_venta(String tipo_de_venta) {
        this.tipo_de_venta = tipo_de_venta;
    }

    public BigDecimal getSubtotal_con_iva() {
        return subtotal_con_iva;
    }

    public void setSubtotal_con_iva(BigDecimal subtotal_con_iva) {
        this.subtotal_con_iva = subtotal_con_iva;
    }

    public BigDecimal getSubtotal_sin_iva() {
        return subtotal_sin_iva;
    }

    public void setSubtotal_sin_iva(BigDecimal subtotal_sin_iva) {
        this.subtotal_sin_iva = subtotal_sin_iva;
    }

    public BigDecimal getSubtotal_no_obj_iva() {
        return subtotal_no_obj_iva;
    }

    public void setSubtotal_no_obj_iva(BigDecimal subtotal_no_obj_iva) {
        this.subtotal_no_obj_iva = subtotal_no_obj_iva;
    }

    public BigDecimal getSubtotal_exento_iva() {
        return subtotal_exento_iva;
    }

    public void setSubtotal_exento_iva(BigDecimal subtotal_exento_iva) {
        this.subtotal_exento_iva = subtotal_exento_iva;
    }

    public BigDecimal getSubtotal_venta() {
        return subtotal_venta;
    }

    public void setSubtotal_venta(BigDecimal subtotal_venta) {
        this.subtotal_venta = subtotal_venta;
    }

    public BigDecimal getIce_venta() {
        return ice_venta;
    }

    public void setIce_venta(BigDecimal ice_venta) {
        this.ice_venta = ice_venta;
    }

    public BigDecimal getDescuento_venta() {
        return descuento_venta;
    }

    public void setDescuento_venta(BigDecimal descuento_venta) {
        this.descuento_venta = descuento_venta;
    }

    public BigDecimal getIva_venta() {
        return iva_venta;
    }

    public void setIva_venta(BigDecimal iva_venta) {
        this.iva_venta = iva_venta;
    }

    public BigDecimal getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(BigDecimal total_venta) {
        this.total_venta = total_venta;
    }

    public BigDecimal getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(BigDecimal utilidad) {
        this.utilidad = utilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
