package com.wj.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author wj
 * @version 1.0
 */
public class MyPanel extends JPanel {

    MyTank myTank=null;
    public MyPanel(){
        myTank=new MyTank(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(myTank.getX(),myTank.getY(),g,0,0);

    }

    /**
     *
     * @param x 坦克左上角横坐标
     * @param y 坦克左上角纵坐标
     * @param g 画笔
     * @param direct 坦克方向（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct){
            case 0:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.fill3DRect(x+18,y,4,30,false);
               // g.drawLine(x+20,y,x+20,y+30);
                break;


            default:
                System.out.println("waiting...");
        }

    }

}


