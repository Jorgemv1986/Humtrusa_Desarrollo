/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.dao;

import com.humtrusa.Mappers.EntidadesMappers;
import com.humtrusa.entidades.Cabecera_ventas;
import com.humtrusa.entidades.Clase_producto;
import com.humtrusa.entidades.Detalle_ventas;
import com.humtrusa.entidades.JoinProductos;
import com.humtrusa.entidades.Join_Cabecera_ventas;
import com.humtrusa.entidades.Join_Detalle_ventas;
import com.humtrusa.entidades.Medidas_producto;
import com.humtrusa.entidades.Tipo_producto;
import com.humtrusa.entidades.Usuario;
import java.math.BigInteger;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class CRUD {

    Connection conect = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    Conexion con = new Conexion();

    String query;

    public ArrayList<JoinProductos> ListarTodosProductos(int op) {
        ArrayList<JoinProductos> lista = new ArrayList<JoinProductos>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarJoinProductos(?) }");
            prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                JoinProductos obj = EntidadesMappers.getJoinProductos(rs);
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

    public ArrayList<Clase_producto> listarComboClase(int op) {
        ArrayList<Clase_producto> lista = new ArrayList<Clase_producto>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call listarComboProductos(?) }");
            proced.setInt(1, op);
            proced.execute();
            rs = proced.getResultSet();
            while (rs.next()) {
                Clase_producto obj = EntidadesMappers.getComboClase(rs);
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

    public ArrayList<Tipo_producto> listarComboTipo(int op) {
        ArrayList<Tipo_producto> lista = new ArrayList<Tipo_producto>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call listarComboProductos(?) }");
            proced.setInt(1, op);
            proced.execute();
            rs = proced.getResultSet();
            while (rs.next()) {
                Tipo_producto obj = EntidadesMappers.getComboTipo(rs);
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

    public ArrayList<Medidas_producto> listarComboMedida(int op) {
        ArrayList<Medidas_producto> lista = new ArrayList<Medidas_producto>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call listarComboProductos(?) }");
            proced.setInt(1, op);
            proced.execute();
            rs = proced.getResultSet();
            while (rs.next()) {
                Medidas_producto obj = EntidadesMappers.getComboMedida(rs);
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

    public String modificarProductos(JoinProductos obj) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call modificarProducto(?,?,?,?,?,?,?,?,?,?,?,?,?) }");
            proced.setString(1, obj.getNombre());
            proced.setBigDecimal(2, obj.getPrecio_compra_referencial());
            proced.setBigDecimal(3, obj.getPrecio_compra_ult());
            proced.setBigDecimal(4, obj.getPrecio_Vent_A());
            proced.setBigDecimal(5, obj.getPrecio_Vent_B());
            proced.setBigDecimal(6, obj.getPrecio_Vent_C());
            proced.setLong(7, obj.getId_clase());
            proced.setLong(8, obj.getId_tipo());
            proced.setLong(9, obj.getId_medida());
            proced.setLong(10, obj.getStock());
            proced.setString(11, obj.getIva());
            proced.setLong(12, obj.getId_producto());
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");

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
        return valor;
    }

    public String ingresoProductos(JoinProductos obj) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call ingresoProducto(?,?,?,?,?,?,?,?,?,?,?,?) }");
            proced.setString(1, obj.getNombre());
            proced.setBigDecimal(2, obj.getPrecio_compra_referencial());
            proced.setBigDecimal(3, obj.getPrecio_compra_ult());
            proced.setBigDecimal(4, obj.getPrecio_Vent_A());
            proced.setBigDecimal(5, obj.getPrecio_Vent_B());
            proced.setBigDecimal(6, obj.getPrecio_Vent_C());
            proced.setLong(7, obj.getId_clase());
            proced.setLong(8, obj.getId_tipo());
            proced.setLong(9, obj.getId_medida());
            proced.setLong(10, obj.getStock());
            proced.setString(11, obj.getIva());
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");

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
        return valor;
    }

    public void inactivarProducto(int op, Long idPro) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call inactivarProducto(?,?) }");
            proced.setLong(1, op);
            proced.setLong(2, idPro);
            proced.executeUpdate();
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
    }
//    ingresoUsuario

    public String ingresoUsuario(Usuario u) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call ingresoUsuario(?,?,?,?,?,?,?,?,?) }");
            proced.setString(1, u.getCedula());
            proced.setString(2, u.getNombres());
            proced.setString(3, u.getApellidos());
            proced.setString(4, u.getTelefono());
            proced.setString(5, u.getDireccion());
            proced.setString(6, u.getCorreo());
            proced.setString(7, u.getContrasena());
            proced.setString(8, u.getTipo_usuario());
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");
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
        return valor;
    }

    public String updateUsuario(Usuario u) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call modificarUsuario(?,?,?,?,?,?,?,?,?,?) }");
            proced.setString(1, u.getCedula());
            proced.setString(2, u.getNombres());
            proced.setString(3, u.getApellidos());
            proced.setString(4, u.getTelefono());
            proced.setString(5, u.getDireccion());
            proced.setString(6, u.getCorreo());
            proced.setString(7, u.getContrasena());
            proced.setString(8, u.getTipo_usuario());
            proced.setLong(9, u.getId());
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");
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
        return valor;
    }

    public ArrayList<Usuario> ListarTodoUsuario(int op) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call listarUsuario(?) }");
            proced.setInt(1, op);
            proced.execute();
            rs = proced.getResultSet();
            while (rs.next()) {
                Usuario obj = EntidadesMappers.getTodoUsuario(rs);
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

//    
    public void inactivarUsuario(int op, Long idUsu) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call inactivarUsuario(?,?) }");
            proced.setLong(1, op);
            proced.setLong(2, idUsu);
            proced.executeUpdate();
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
    }

    public String agregarComponenteClase(int op, Clase_producto u) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call agregarComponenteProducto(?,?,?) }");
            proced.setInt(1, op);
            proced.setString(2, u.getNombre_clase());
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");
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
        return valor;
    }

    public String agregarComponenteTipo(int op, Tipo_producto u) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call agregarComponenteProducto(?,?,?) }");
            proced.setInt(1, op);
            proced.setString(2, u.getNombre_tipo());
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");
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
        return valor;
    }

    public String agregarComponenteMedida(int op, Medidas_producto u) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call agregarComponenteProducto(?,?,?) }");
            proced.setInt(1, op);
            proced.setString(2, u.getNombre_medida());
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");
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
        return valor;
    }

    public String InsertarCabeceraVentas(Cabecera_ventas obj) {

        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call InsertarCabeceraVentas(?,?,?,?,?,?,?,?,?,?,?,?) }");
            prodProAlm.setString(1, obj.getMun_venta());
            prodProAlm.setLong(2, obj.getId_cliente());
            prodProAlm.setLong(3, obj.getId_empresa());
            prodProAlm.setString(4, obj.getForma_de_pago());
            prodProAlm.setString(5, obj.getTipo_de_venta());
            prodProAlm.setBigDecimal(6, obj.getSubtotal_con_iva());
            prodProAlm.setBigDecimal(7, obj.getSubtotal_sin_iva());
            prodProAlm.setBigDecimal(8, obj.getIva_venta());
            prodProAlm.setBigDecimal(9, obj.getDescuento_venta());
            prodProAlm.setBigDecimal(10, obj.getTotal_venta());
            prodProAlm.setString(11, obj.getEstado());

            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.executeUpdate();
            valor = prodProAlm.getString("valor");
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
        return valor;
    }

    ////////// insertar detalle ventas
    public String InsertarDetalleVentas(Detalle_ventas obj) {

        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call InsertarDetalleVentas(?,?,?,?,?,?,?) }");
            prodProAlm.setLong(1, obj.getId_cabecera_venta());
            prodProAlm.setLong(2, obj.getId_producto());
            prodProAlm.setBigDecimal(3, obj.getPrecio());
            prodProAlm.setLong(4, obj.getCantidad());
            prodProAlm.setBigDecimal(5, obj.getIva());
            prodProAlm.setBigDecimal(6, obj.getDescuento());

            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.executeUpdate();
            valor = prodProAlm.getString("valor");
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
        return valor;
    }

    public int obtenerNumeroOrdenes(String query) {
        int id = 0;
        try {
            conect = con.conectar();

            java.sql.Statement st = conect.createStatement();
            rs = st.executeQuery(query);
            rs.next();
            id = rs.getInt("cantidad");
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
//    public ArrayList<joinProductoDetallesFaltantes> listarFaltantesDetalles(int op) {
//        ArrayList<joinProductoDetallesFaltantes> lista = new ArrayList<joinProductoDetallesFaltantes>();
//
//        try {
//            conect = con.conectar();
//            conect.setAutoCommit(false);
//            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
//                    "{ call listarfaltantesEnNota(?) }");
//            prcProcedimientoAlmacenado.setInt(1, op);
//            prcProcedimientoAlmacenado.execute();
//            rs = prcProcedimientoAlmacenado.getResultSet();
//            while (rs.next()) {
//                joinProductoDetallesFaltantes obj = EntidadesMappers.getJoinDetallesFaltantesFromResultSet(rs);
//                lista.add(obj);
//            }
//            conect.commit();
//        } catch (Exception e) {
//            try {
//                conect.rollback();
//                e.printStackTrace();
//            } catch (SQLException ex) {
//                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } finally {
//            try {
//                conect.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return lista;
//    }
//

    public String IngresoDeSesion(Usuario obj) {

        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call inicioSesion(?,?,?) }");
            prodProAlm.setString(1, obj.getCedula());
            prodProAlm.setString(2, obj.getContrasena());

            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.executeUpdate();
            valor = prodProAlm.getString("valor");
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
        return valor;
    }

    public String EditarComponenteProducto(int op, String u,Long idCom) {
        String valor = "";

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call EditarComponenteProducto(?,?,?,?) }");
            proced.setInt(1, op);
            proced.setString(2, u);
            proced.setLong(3, idCom);
            proced.registerOutParameter("valor", Types.VARCHAR);
            proced.executeUpdate();
            valor = proced.getString("valor");
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
        return valor;
    }
    public ArrayList<Join_Cabecera_ventas> ListarCabeceraVentas(int op) {
        ArrayList<Join_Cabecera_ventas> lista = new ArrayList<Join_Cabecera_ventas>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call listarCabeceraVentas(?) }");
            proced.setInt(1, op);
            proced.execute();
            rs = proced.getResultSet();
            while (rs.next()) {
                Join_Cabecera_ventas obj = EntidadesMappers.getJoinCabecerasVentas(rs);
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
    public ArrayList<Join_Detalle_ventas> ListarDetallesVentas(int idCab) {
        ArrayList<Join_Detalle_ventas> lista = new ArrayList<Join_Detalle_ventas>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement proced = conect.prepareCall(
                    "{ call ListarDetallesVentas(?) }");
            proced.setInt(1, idCab);
            proced.execute();
            rs = proced.getResultSet();
            while (rs.next()) {
                Join_Detalle_ventas obj = EntidadesMappers.getJoinDetallesVentas(rs);
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
