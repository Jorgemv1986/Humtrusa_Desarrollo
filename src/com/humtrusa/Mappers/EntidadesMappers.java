/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.Mappers;

import com.humtrusa.entidades.Clase_producto;
import com.humtrusa.entidades.JoinProductos;
import com.humtrusa.entidades.Join_Cabecera_ventas;
import com.humtrusa.entidades.Join_Detalle_ventas;
import com.humtrusa.entidades.Medidas_producto;
import com.humtrusa.entidades.StockVentas;
import com.humtrusa.entidades.Tipo_producto;
import com.humtrusa.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class EntidadesMappers {
   
    public static JoinProductos getJoinProductos(ResultSet rs) {
        JoinProductos obj = new JoinProductos();
        try {
            obj.setId_producto(rs.getLong("ID"));
            obj.setNombre(rs.getString("NOMBRE"));
            obj.setPrecio_compra_referencial(rs.getBigDecimal("precio_compra_referencial"));
            obj.setPrecio_compra_ult(rs.getBigDecimal("precio_compra_ult"));
            obj.setPrecio_Vent_A(rs.getBigDecimal("precio_Vent_A"));
            obj.setPrecio_Vent_B(rs.getBigDecimal("precio_Vent_B"));
            obj.setPrecio_Vent_C(rs.getBigDecimal("precio_Vent_C"));
            obj.setId_clase(rs.getLong("ID_CLASE"));
            obj.setClase(rs.getString("CLASE"));
            obj.setId_tipo(rs.getLong("ID_TIPO"));
            obj.setTipo(rs.getString("TIPO"));
            obj.setId_medida(rs.getLong("ID_MEDIDA"));
            obj.setMedida(rs.getString("MEDIDA"));
            obj.setStock(rs.getLong("stock"));
            obj.setIva(rs.getString("IVA"));
            obj.setEstado(rs.getString("ESTADO"));
            
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static Clase_producto getComboClase(ResultSet rs) {
        Clase_producto obj = new Clase_producto();
        try {
            
            obj.setId_clase(rs.getLong("ID"));
            obj.setNombre_clase(rs.getString("NOMBRE"));
            obj.setEstado(rs.getString("ESTADO"));
              
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static Tipo_producto getComboTipo(ResultSet rs) {
        Tipo_producto obj = new Tipo_producto();
        try {
            
            obj.setId_tipo(rs.getLong("ID"));
            obj.setNombre_tipo(rs.getString("NOMBRE"));
            obj.setEstado(rs.getString("ESTADO"));
              
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static Medidas_producto getComboMedida(ResultSet rs) {
        Medidas_producto obj = new Medidas_producto();
        try {
            
            obj.setId_medida(rs.getLong("ID"));
            obj.setNombre_medida(rs.getString("NOMBRE"));
            obj.setEstado(rs.getString("ESTADO"));
              
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
  
    public static Usuario getTodoUsuario(ResultSet rs) {
        Usuario obj = new Usuario();
        try {
            obj.setId(rs.getLong("ID"));
            obj.setCedula(rs.getString("CEDULA"));
            obj.setNombres(rs.getString("NOMBRES"));
            obj.setApellidos(rs.getString("APELLIDOS"));
            obj.setTelefono(rs.getString("TELEFONO"));
            obj.setDireccion(rs.getString("DIRECCION"));
            obj.setCorreo(rs.getString("CORREO"));
            obj.setContrasena(rs.getString("CONTRASENA"));
            obj.setTipo_usuario(rs.getString("TIPO_USUARIO"));
            obj.setEstado(rs.getString("ESTADO"));
                     
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }        
    public static Join_Cabecera_ventas getJoinCabecerasVentas(ResultSet rs) {
        Join_Cabecera_ventas obj = new Join_Cabecera_ventas();
        try {
            obj.setId_cabecera_venta(rs.getLong("ID"));
            obj.setMun_venta(rs.getString("NUM_VENTA"));
            obj.setFecha_venta(rs.getDate("FECHA_CREACION"));
            obj.setId_cliente(rs.getLong("ID_USUARIO"));
            obj.setCedula(rs.getString("CEDULA"));
            obj.setNombres(rs.getString("NOMBRES"));
            obj.setApellidos(rs.getString("APELLIDOS"));
            obj.setTelefono(rs.getString("TELEFONO"));
            obj.setDireccion(rs.getString("DIRECCION"));
            obj.setCorreo(rs.getString("CORREO"));
            obj.setForma_de_pago(rs.getString("TIPO_PAGO"));
            obj.setTipo_de_venta(rs.getString("TIPO_VENTA"));
            obj.setSubtotal_con_iva(rs.getBigDecimal("SUBTOTAL_CON_IVA"));
            obj.setSubtotal_sin_iva(rs.getBigDecimal("SUBTOTAL_SIN_IVA"));
            obj.setSubtotal_venta(rs.getBigDecimal("SUBTOTAL"));
            obj.setIva_venta(rs.getBigDecimal("IVA_TOTAL"));
            obj.setDescuento_venta(rs.getBigDecimal("DESCUENTO_TOTAL"));
            obj.setTotal_venta(rs.getBigDecimal("TOTAL"));
            
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static Join_Detalle_ventas getJoinDetallesVentas(ResultSet rs) {
        Join_Detalle_ventas obj = new Join_Detalle_ventas();
        try {
            obj.setId_detalle_venta(rs.getLong("ID"));
            obj.setId_cabecera_venta(rs.getLong("ID_CABECERA_VENTA"));
            obj.setId_producto(rs.getLong("ID_PRODUCTO"));
            obj.setNombre_producto(rs.getString("NOMBRE"));
            obj.setPrecio(rs.getBigDecimal("PRECIO"));
            obj.setCantidad(rs.getLong("CANTIDAD"));
            obj.setSubtotal(rs.getBigDecimal("SUBTOTAL"));
            obj.setDescuento(rs.getBigDecimal("DESCUENTO"));
            obj.setIva(rs.getBigDecimal("IVA"));
            obj.setTotal(rs.getBigDecimal("TOTAL"));
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static StockVentas getStockVentasFromResultSet(ResultSet rs) {
        StockVentas obj = new StockVentas();
        try {
            obj.setId_producto(rs.getLong("id_producto"));
            obj.setCantidad(rs.getLong("cantidad"));


        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
}
