package com.humtrusa.views.principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Fondo extends javax.swing.JPanel {

    public Fondo(int w, int h) {
        this.setSize(w, h);
    }

    @Override
    public void paintComponent(Graphics g) {
        Dimension dim = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/iconos/paisaje2.png"));
        g.drawImage(imagenFondo.getImage(), 0, 0, dim.width, dim.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
