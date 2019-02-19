/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.Mappers;

import com.humtrusa.entidades.Clase_producto;
import com.humtrusa.entidades.JoinProductos;
import com.humtrusa.entidades.Medidas_producto;
import com.humtrusa.entidades.Tipo_producto;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
