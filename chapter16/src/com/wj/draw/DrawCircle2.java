package com.wj.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author wj
 * @version 1.0
 */
public class DrawCircle2 extends JFrame{
    private MyPanel1 mp = null;

    public static void main(String[] args) {
        new DrawCircle2(); //这个组件构建的时候就自动调用MyPanel1// 的方法了

    }
//这么写相当于把操作都写到构造器方法了，好处就是当我一创建这个对象的时候，构造方法里的操作就全部执行了
    //不用再去上面创建对象调用了

    public DrawCircle2() {
        mp=new MyPanel1();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel1 extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint方法被调用");
        g.drawOval(10,10,100,100);

    }
}