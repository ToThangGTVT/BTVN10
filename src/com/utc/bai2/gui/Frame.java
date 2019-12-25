package com.utc.bai2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame extends JFrame implements WindowListener, KeyListener {
    public static final int H_FRAME = 600;
    public static final int W_FRAME = 600;
    JPanel jPanel;

    public Frame() throws HeadlessException {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        setTitle("Bài 1");
        setSize(W_FRAME, H_FRAME);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addWindowListener(this);
        addKeyListener(this);

        jPanel = new JPanel(new CardLayout());
        Layout1 layout1 = new Layout1();
        Layout2 layout2 = new Layout2();
        jPanel.add(layout1,"1");
        jPanel.add(layout2,"2");
        add(jPanel);

        setVisible(true);
    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn thoát", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_LEFT){
            CardLayout cl = (CardLayout) jPanel.getLayout();
            cl.show(jPanel,"1");
        } else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
            CardLayout cl = (CardLayout) jPanel.getLayout();
            cl.show(jPanel,"2");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
