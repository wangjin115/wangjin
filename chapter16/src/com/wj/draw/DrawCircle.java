package com.wj.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author wj
 * @version 1.0
 */
public class DrawCircle extends JFrame{
    private MyPanel mp=null;
    public static void main(String[] args) {
        MyPanel mp=new MyPanel();
        DrawCircle drawCircle = new DrawCircle();
        drawCircle.add(mp);
        drawCircle.setSize(400,300);
        drawCircle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawCircle.setVisible(true);

    }
    public DrawCircle(){
//        mp=new MyPanel();
//        this.add(mp);
//        this.setSize(400,300);
//        this.setVisible(true);
    }

}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
       super.paint(g);
       g.drawOval(10,10,100,100);

    }
}