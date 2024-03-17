package com.wj.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author wj
 * @version 1.0
 */
public class BallMove extends JFrame {
    MyPanel mp=null;
    public static void main(String[] args) {
     new BallMove();

    }
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
//KeyListener监听键盘的输入
class MyPanel extends Panel implements KeyListener {
    int x=10;
    int y=10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }
//有字符输出时，该方法被触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
//当某个键按下时，该方法被触发
    @Override
    public void keyPressed(KeyEvent e) {
        int speed=10;
//        System.out.println((char)e.getKeyCode());
    if (e.getKeyCode()==KeyEvent.VK_DOWN){

        y=Math.min(getHeight()-20,y+speed);
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
      //  y--;
        y = Math.max(0, y - speed);
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
       // x++;
        x = Math.min(getWidth() - 20, x + speed);
    }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
      //  x--;
        x = Math.max(0, x - speed);
    }

        this.repaint();
    }
//当某个键释放时，该方法被触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}