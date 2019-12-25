package com.utc.bai1.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuPanel extends JPanel implements MouseListener {
    public MenuPanel() {
        setBackground( new Color(255, 52, 66));
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground( new Color(255, 134, 219));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground( new Color(255, 52, 66));
    }
}
