package com.wj.tankgame;

import javax.swing.*;

/**
 * @author wj
 * @version 1.0
 */
public class TankGame01 extends JFrame {
    //TankGame01是游戏窗口
    MyPanel mp=null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();

    }
    public TankGame01(){
        mp=new MyPanel();  //mp是游戏面板（也就是绘图区域）
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
