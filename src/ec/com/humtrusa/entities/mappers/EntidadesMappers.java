/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.humtrusa.entities.mappers;

import ec.com.humtrusa.entities1.Persona;
import ec.com.humtrusa.join_entidades.JoinListarProductosVentas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author josel
 */
public class EntidadesMappers {




    /////////// mapper identidad listar producto ventas
    public static JoinListarProductosVentas getJoinTodosProductosVentasFromResultSet(ResultSet rs) {
        JoinListarProductosVentas obj = new JoinListarProductosVentas();
       
        try {
    
            obj.setId_producto(rs.getLong("Codigo"));
            obj.setProducto_nombre(rs.getString("Nombre del producto"));
            obj.setProducto_descripcion(rs.getString("Descripcion"));
            //obj.setId_tipo(rs.getLong("ID_TIPO"));
            obj.setTipo_nombre(rs.getString("Tipo"));
            //obj.setId_medida(rs.getLong("ID_MEDIDAS"));
            obj.setMedida_nombre(rs.getString("Medida"));
            //obj.setId_envase(rs.getLong("ID_ENVASE"));
            obj.setEnvase_nombre(rs.getString("Envase"));
            //obj.setId_marca(rs.getLong("ID_MARCAS"));
            obj.setMarca_nombre(rs.getString("Marca"));
            //obj.setId_stock(rs.getLong("ID_PRODUCTO"));
            obj.setStock(rs.getDouble("Stock"));
            obj.setIva(rs.getString("Iva"));
            //obj.setId_precio(rs.getLong("ID_PRECIO"));
            obj.setPrecio_venta(rs.getDouble("Precio de venta"));
            

        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    /////////// mapper identidad listar cliente ventas
    public static Persona getTodosClienteVentasFromResultSet(ResultSet rs) {
        Persona obj = new Persona();
       
        try {
    
            obj.setId_Clientes(rs.getLong("Codigo"));
            obj.setCedula(rs.getString("Cedula"));
            obj.setNombre(rs.getString("Nombre"));
            obj.setApellido(rs.getString("Apellido"));
            obj.setDireccion(rs.getString("Direccion"));
            obj.setStr_telefono(rs.getString("Telefono"));
            obj.setStr_correo(rs.getString("correo"));
     
            

        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

}
