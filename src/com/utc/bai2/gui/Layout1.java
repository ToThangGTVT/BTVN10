package com.utc.bai2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Layout1 extends JPanel implements MouseListener {
    private static final int H_RECT=50;
    private static  final int W_RECT =80;
    public Layout1() {
        setBackground(new Color(255, 255, 255));
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(g2d);
        drwRect(g2d,100,100, new Color(255, 2,0),"RED");
        drwRect(g2d,100+W_RECT,100+H_RECT, new Color(255, 153, 14),"ORANGE");
        drwRect(g2d,100+2*W_RECT,100+2*H_RECT, new Color(255, 255, 0),"YELLOW");
        drwRect(g2d,100+3*W_RECT,100+3*H_RECT, new Color(21, 220, 24),"GREEN");
        drwRect(g2d,100+2*W_RECT,100+4*H_RECT, new Color(32, 134, 220),"BLUE");
        drwRect(g2d,100+1*W_RECT,100+5*H_RECT, new Color(115, 19, 191),"INDIGO");
        drwRect(g2d,100,100+6*H_RECT, new Color(255, 134, 219),"VIOLET");
    }

    private void drwRect(Graphics2D g2d, int x,int y, Color color, String str){
        g2d.setColor(color);
        g2d.fillRect(x,y,W_RECT,H_RECT );
        g2d.setColor(new Color(0,0,0));
        g2d.setFont(new Font("Consolas",Font.BOLD,19));
        g2d.drawString(str,(2*x+10)/2,(2*y+H_RECT+10)/2);
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
