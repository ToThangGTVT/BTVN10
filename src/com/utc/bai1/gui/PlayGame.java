package com.utc.bai1.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayGame extends JPanel implements MouseListener {
    public PlayGame() {
        setBackground(new Color(92, 154, 255));
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
        setBackground(new Color(43, 131, 76));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(new Color(92, 154, 255));
    }
}
