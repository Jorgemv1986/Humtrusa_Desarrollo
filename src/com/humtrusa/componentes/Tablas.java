/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.componentes;

//import com.objetos.domain.Laboratorio;
import com.humtrusa.entidades.Detalle_ventas;
import com.humtrusa.entidades.JoinProductos;
import com.humtrusa.entidades.Usuario;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author alumno
 */
public class Tablas {
    
    static DefaultTableModel model;
    
    public static DefaultTableModel VaciarTabla(JTable tabla) {
        DefaultTableModel lab
                = (DefaultTableModel) tabla.getModel();
        while (lab.getRowCount() > 0) {
            lab.removeRow(0);
        }
        return lab;
        
    }
    
//    public static void listarTodosProductos(ArrayList<JoinProductos> lista, JTable Tabla) {
//        // new JScrollPane(Tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        int[] a = {50, 100, 80, 80, 50, 50, 50, 50, 50, 50, 50, 50};
//        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
//        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
//        tcr.setHorizontalAlignment(SwingConstants.CENTER);
//        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
//        model = Tablas.VaciarTabla(Tabla);
//        Tabla.setAutoscrolls(true);
//        String[] Co = {"CODIGO", "Nombre", "CLASE", "TIPO", "U.MEDIDA", "STOCK", "PRECIO A", "PRECIO B", "PRECIO C", "COMPRA ULT.", "PRECIO REF.", "COBRA IVA"};
//
//        //   Date[] Ca = {Date.valueOf("Fecha")};
//        String[] Filas = new String[12];
//        //  Date[] Fila = new Date [1];
//        model = new DefaultTableModel(null, Co);
//        //  laboratorio = new DefaultTableModel(null, Ca);
//        Tabla.setShowGrid(true);
//        for (int i = 0; i < lista.size(); i++) {
//            Filas[0] = lista.get(i).getId_producto().toString();
//            Filas[1] = lista.get(i).getNombre();
//            Filas[2] = lista.get(i).getClase();
//            Filas[3] = lista.get(i).getTipo();
//            Filas[4] = lista.get(i).getMedida();
//            Filas[5] = lista.get(i).getStock().toString();
//            Filas[6] = lista.get(i).getPrecio_Vent_A().toString();
//            Filas[7] = lista.get(i).getPrecio_Vent_B().toString();
//            Filas[8] = lista.get(i).getPrecio_Vent_C().toString();
//            Filas[9] = lista.get(i).getPrecio_compra_ult().toString();
//            Filas[10] = lista.get(i).getPrecio_compra_referencial().toString();
//            Filas[11] = lista.get(i).getIva();
//            model.addRow(Filas);
//            //     laboratorio.addRow(Fila);
//            
//            Tabla.setModel(model);
//            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
//            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
//            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
//            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
//            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
//            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
//            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
//            Tabla.getColumnModel().getColumn(6).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(7).setPreferredWidth(a[7]);
//            Tabla.getColumnModel().getColumn(7).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(8).setPreferredWidth(a[8]);
//            Tabla.getColumnModel().getColumn(8).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(9).setPreferredWidth(a[9]);
//            Tabla.getColumnModel().getColumn(9).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(10).setPreferredWidth(a[10]);
//            Tabla.getColumnModel().getColumn(10).setCellRenderer(tcr);
//            Tabla.getColumnModel().getColumn(11).setPreferredWidth(a[11]);
//            Tabla.getColumnModel().getColumn(11).setCellRenderer(tcr);
//        }
//        
//    }
    /// 17/11/2018 jefferson Anchundia modulo Faltantes 15:15:00  

    //////////
    
    
     public static void listarTodosProductos (ArrayList<JoinProductos> lista, JTable Tabla) {        
        model = Tablas.VaciarTabla(Tabla);
        int[] a = {70, 200, 170, 130, 150, 80, 110, 110, 110, 110, 110, 90};
        model.setColumnIdentifiers(new Object[]{"CODIGO", "Nombre", "CLASE", "TIPO", "U.MEDIDA", "STOCK", "PRECIO A", "PRECIO B", "PRECIO C", "COMPRA ULT.", "PRECIO REF.", "COBRA IVA"});
        
        try {
            for(JoinProductos rs:lista) {
                // añade los resultado a al modelo de tabla
                model.addRow(new Object[]{rs.getId_producto(), rs.getNombre(),rs.getClase(),rs.getTipo(),rs.getMedida(),
                rs.getStock().toString(),rs.getPrecio_Vent_A(),rs.getPrecio_Vent_B(),rs.getPrecio_Vent_C(),
                rs.getPrecio_compra_ult(),rs.getPrecio_compra_referencial(),rs.getIva()});
            }            
            // asigna el modelo a la tabla
          
           Tabla.setModel(model);  
           Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
           Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
           Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
           Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
           Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
           Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
           Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
           Tabla.getColumnModel().getColumn(7).setPreferredWidth(a[7]);
           Tabla.getColumnModel().getColumn(8).setPreferredWidth(a[8]);
           Tabla.getColumnModel().getColumn(9).setPreferredWidth(a[9]);
           Tabla.getColumnModel().getColumn(10).setPreferredWidth(a[10]);
           Tabla.getColumnModel().getColumn(11).setPreferredWidth(a[11]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void filtroProducto(String valor, JTable Tabla) {
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + valor));
    }
    
    
    //////////  cargar lista detalle ventas  
    public static void cargarListaVentasDetalle(JTable Tabla, ArrayList<Detalle_ventas> lista) {
        
        int[] a = {30, 160, 50,50, 50, 50, 50};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO", "PRODUCTO", "CANTIDAD", "PRECIO", "DESCUENTO","IVA","TOTAL"};
        String[] Filas = new String[7];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = ""+ lista.get(i).getId_producto();
            Filas[1] = lista.get(i).getNombre_producto();
            Filas[2] = "" + lista.get(i).getCantidad();
            Filas[3] = lista.get(i).getPrecio().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            Filas[4] = lista.get(i).getDescuento().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            Filas[5] = lista.get(i).getIva().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            Filas[6] = lista.get(i).getTotal().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            model.addRow(Filas);
//            subtotal = Double.parseDouble(Filas[6]) + subtotal;
//            descuento = Double.parseDouble(Filas[4]) + descuento;
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
            Tabla.getColumnModel().getColumn(6).setCellRenderer(tcr);
        }
//        TxtSubtotalconIva.setText(Double.toString(subtotal));
//        TxtDescuento.setText(Double.toString(descuento));
        

    }
    
    public static void listarUsuario (ArrayList<Usuario> lista, JTable Tabla) {        
        model = Tablas.VaciarTabla(Tabla);
        int[] a = { 150, 190, 190, 150, 80, 110, 110};
            model.setColumnIdentifiers(new Object[]{"CEDULA", "NOMBRES", "APELLIDOS", "TELEFONO", "DIRECCION", "CORREO", "TIPO USUARIO"});
        
        try {
            for(Usuario rs:lista) {
                // añade los resultado a al modelo de tabla
                model.addRow(new Object[]{rs.getCedula(), rs.getNombres(),rs.getApellidos(),rs.getTelefono(),rs.getDireccion(),
                rs.getCorreo(),rs.getTipo_usuario()});
            }            
            // asigna el modelo a la tabla
          
           Tabla.setModel(model);  
           Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
           Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
           Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
           Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
           Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
           Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
           Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
          
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
