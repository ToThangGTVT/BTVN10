package com.utc.bai2.gui;

import jdk.jfr.Frequency;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Layout2 extends JPanel implements MouseListener {
    private static final int H_RECT=80;
    private static  final int W_RECT =80;

    public Layout2() {
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(g2d);
        drwRect(g2d,0,0,new Color(255, 255,0),"LEFTTOP");
        drwRect(g2d, Frame.W_FRAME-W_RECT-15,0,new Color(115, 19, 191),"RIGHTTOP");
        drwRect(g2d, Frame.W_FRAME-W_RECT-15,Frame.H_FRAME-H_RECT-39,new Color(21, 220, 24),"RIGHTBOTTOM");
        drwRect(g2d, 0,Frame.H_FRAME-H_RECT-39,new Color(255, 0,0),"LEFTBOTTOM");
        drwRect(g2d, (Frame.W_FRAME-W_RECT-15)/2,0,new Color(1, 207, 255),"TOP");
        drwRect(g2d, (Frame.W_FRAME-W_RECT-15)/2,(Frame.H_FRAME-H_RECT-39)/2,new Color(255, 153, 14),"CENTER");
        drwRect(g2d, (Frame.W_FRAME-W_RECT-15),(Frame.H_FRAME-H_RECT-39)/2,new Color(13, 131, 14),"RIGHT");
        drwRect(g2d, (Frame.W_FRAME-W_RECT-15)/2,(Frame.H_FRAME-H_RECT-39),new Color(131, 71, 37),"BOTTOM");
        drwRect(g2d, 0,(Frame.H_FRAME-H_RECT-39)/2,new Color(40, 64, 131),"LEFT");
    }

    private void drwRect(Graphics2D g2d, int x, int y, Color color, String str){
        g2d.setColor(color);
        g2d.fillRect(x,y,W_RECT,H_RECT );
        g2d.setColor(new Color(0,0,0));
        g2d.setFont(new Font("Consolas",Font.BOLD,19));
        g2d.drawString(str,(2*x)/2,(2*y+H_RECT+10)/2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(new Color(51, 51, 51));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(new Color(255, 255, 255));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(new Color(0,0,0));
    }
}
