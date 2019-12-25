package com.utc.bai1.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame extends JFrame implements WindowListener, KeyListener {
    JPanel jPanel;
    public Frame() throws HeadlessException {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        setTitle("Bài 1");
        setSize(600,600);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addWindowListener(this);
        addKeyListener(this);
        jPanel = new JPanel(new CardLayout());
        MenuPanel menuPanel = new MenuPanel();
        PlayGame playGame= new PlayGame();
        jPanel.add(menuPanel,"1");
        jPanel.add(playGame,"2");
        add(jPanel);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (JOptionPane.showConfirmDialog(
                null,
                "Bạn muốn thoát",
                "Thông báo",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            e.getWindow().dispose();
        };
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
            CardLayout cardLayout = (CardLayout)jPanel.getLayout();
            cardLayout.show(jPanel,"1");
        } else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            CardLayout cardLayout = (CardLayout)jPanel.getLayout();
            cardLayout.show(jPanel,"2");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
