/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.componentes;

import com.humtrusa.entidades.Clase_producto;
import com.humtrusa.entidades.JoinProductos;
import com.humtrusa.entidades.Medidas_producto;
import com.humtrusa.entidades.Tipo_producto;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author usuario
 */
public class Formulario {

    public static DefaultComboBoxModel listarComboClase(ArrayList<Clase_producto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = new Object[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i)] = lista.get(i).getNombre_clase();
        }
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    public static DefaultComboBoxModel listarComboTipo(ArrayList<Tipo_producto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = new Object[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i)] = lista.get(i).getNombre_tipo();
        }
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    public static DefaultComboBoxModel listarComboMedida(ArrayList<Medidas_producto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = new Object[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i)] = lista.get(i).getNombre_medida();
        }
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    public static DefaultComboBoxModel listarComboClaseIP(ArrayList<Clase_producto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = " TODOS ";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_clase();
        }
        System.out.println(lista.size() + " CHAM " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    public static DefaultComboBoxModel listarComboTipoIP(ArrayList<Tipo_producto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = " TODOS ";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_tipo();
        }
        System.out.println(lista.size() + " CHAM " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    public static DefaultComboBoxModel listarComboMedidaIP(ArrayList<Medidas_producto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = " TODOS ";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_medida();
        }
        System.out.println(lista.size() + " CHAM " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    public static String listarComboClaseSeleccion(JoinProductos obj, ArrayList<Clase_producto> lista) {
        JoinProductos model = new JoinProductos();
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(obj.getId_clase(), lista.get(i).getId_clase())) {
                model.setClase(lista.get(i).getNombre_clase());
            }
        }

        return model.getClase();

    }

    public static String listarComboTipoSeleccion(JoinProductos obj, ArrayList<Tipo_producto> lista) {
        JoinProductos model = new JoinProductos();
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(obj.getId_tipo(), lista.get(i).getId_tipo())) {
                model.setTipo(lista.get(i).getNombre_tipo());
            }
        }

        return model.getTipo();

    }

    public static String listarComboMedidaSeleccion(JoinProductos obj, ArrayList<Medidas_producto> lista) {
        JoinProductos model = new JoinProductos();
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(obj.getId_medida(), lista.get(i).getId_medida())) {
                model.setMedida(lista.get(i).getNombre_medida());
            }
        }

        return model.getMedida();

    }

    public static String listarComboIVASeleccion(JoinProductos obj) {
        JoinProductos model = new JoinProductos();
        String valor = "";

        switch (obj.getIva().charAt(0)) {

            case 'S':
                valor = "SI";
                break;
            case 'N':
                valor = "NO";
                break;

            default:
                valor = "TODOS";
                break;
        }

        return valor;
    }

    public static ArrayList<JoinProductos> listarTablaComboMedida(ArrayList<Medidas_producto> listaMedida, ArrayList<JoinProductos> listapro, String valor) {
        Long a = null;
        ArrayList<JoinProductos> listax = new ArrayList<>();
        for (int i = 0; i < listaMedida.size(); i++) {
            if (listaMedida.get(i).getNombre_medida().equals(valor)) {
                a = listaMedida.get(i).getId_medida();
                System.out.println("el " + a);
            }
        }
        for (int j = 0; j < listapro.size(); j++) {
            if (listapro.get(j).getId_medida() == a) {
                System.out.println("prod " + listapro.get(j).getNombre());
                listax.add(listapro.get(j));
            }
        }
        return listax;
    }

    public static ArrayList<JoinProductos> listarTablaComboTipo(ArrayList<Tipo_producto> listaTipo, ArrayList<JoinProductos> listapro, String valor) {
        Long a = null;
        ArrayList<JoinProductos> listax = new ArrayList<>();
        for (int i = 0; i < listaTipo.size(); i++) {
            if (listaTipo.get(i).getNombre_tipo().equals(valor)) {
                a = listaTipo.get(i).getId_tipo();
                System.out.println("el " + a);
            }
        }
        for (int j = 0; j < listapro.size(); j++) {
            if (listapro.get(j).getId_tipo() == a) {
                System.out.println("prod " + listapro.get(j).getNombre());
                listax.add(listapro.get(j));
            }
        }
        return listax;
    }

    public static ArrayList<JoinProductos> listarTablaComboClase(ArrayList<Clase_producto> listaClase, ArrayList<JoinProductos> listapro, String valor) {
        Long a = null;
        ArrayList<JoinProductos> listax = new ArrayList<>();
        for (int i = 0; i < listaClase.size(); i++) {
            if (listaClase.get(i).getNombre_clase().equals(valor)) {
                a = listaClase.get(i).getId_clase();
                System.out.println("el " + a);
            }
        }
        for (int j = 0; j < listapro.size(); j++) {
            if (listapro.get(j).getId_clase() == a) {
                System.out.println("prod " + listapro.get(j).getNombre());
                listax.add(listapro.get(j));
            }
        }
        return listax;
    }

    public static ArrayList<JoinProductos> listarTablaComboIVA(ArrayList<JoinProductos> listapro, String valor) {
        String op = "";
        ArrayList<JoinProductos> listax = new ArrayList<>();
        System.out.println("valir "+valor);
        switch (valor) {

            case "SI":
                op = "S";
                for (int j = 0; j < listapro.size(); j++) {
                    if (listapro.get(j).getIva().equals(op)) {
                        System.out.println("prod " + listapro.get(j).getNombre());
                        listax.add(listapro.get(j));
                    }
                }
                break;
            case "NO":
                op = "N";
                for (int j = 0; j < listapro.size(); j++) {
                    if (listapro.get(j).getIva().equals(op)) {
                        System.out.println("prod " + listapro.get(j).getNombre());
                        listax.add(listapro.get(j));
                    }
                }
                break;

            default:
                op = "TODOS";
                listax= listapro;
                break;
        }

        return listax;
    }
}
