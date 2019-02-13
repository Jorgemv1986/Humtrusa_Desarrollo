/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.humtrusa.dao;

import ec.com.humtrusa.entities.mappers.EntidadesMappers;
import ec.com.humtrusa.entities1.Persona;
import ec.com.humtrusa.join_entidades.JoinListarProductosVentas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD {

    Connection conect = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    Conexion con = new Conexion();
    String query;

    //////  listar Producto venta  
    public ArrayList<JoinListarProductosVentas> ListarTodoJoinProductosVentas(String op1, String op2) {
        ArrayList<JoinListarProductosVentas> lista = new ArrayList<JoinListarProductosVentas>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{call listarProductosVentas(?,?)}");
            prcProcedimientoAlmacenado.setString(1, op1);
            prcProcedimientoAlmacenado.setString(2, op2);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                JoinListarProductosVentas obj = EntidadesMappers.getJoinTodosProductosVentasFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    //////// Listar Cliente Ventas
    public ArrayList<Persona> ListarTodoClienteVentas(String op1, String op2) {
        ArrayList<Persona> lista = new ArrayList<Persona>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{call ListarClientesVentas(?,?)}");
            prcProcedimientoAlmacenado.setString(1, op1);
            prcProcedimientoAlmacenado.setString(2, op2);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                Persona obj = EntidadesMappers.getTodosClienteVentasFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;

    }

}
