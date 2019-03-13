/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.humtrusa.views.principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class images {
        public void logoHum(JLabel bh){
        ImageIcon iconoAdmin = new ImageIcon(getClass().getResource("/iconos/logo Humtrusa.jpg")); //imagen original
        ImageIcon icoLogin = new ImageIcon(iconoAdmin.getImage().getScaledInstance(bh.getWidth(), bh.getHeight(), Image.SCALE_DEFAULT)); //imagen redimencionada en funcion del tamaño del label
        bh.setIcon(icoLogin);
          
    }
        
}
