package com.wj.tankgame2;

import javax.swing.*;

/**
 * @author wj
 * @version 1.0
 */
public class TankGame02 extends JFrame {
    //TankGame01是游戏窗口

    //初始化面板
    MyPanel mp=null;
    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();
        //这里就相当于把游戏窗口调出来，有什么需要在窗口执行的操作就在下面构造器里设置

    }
    public TankGame02(){
        mp=new MyPanel();  //mp是游戏面板（也就是绘图区域），把面板放到窗口
        //为什么我在这创建一个mp对象，他里面的paint方法就会跟着执行呢
        // 是因为系统默认，在构造组件的时候会执行一次paint方法
        // TankGame02就是组件，就是包着画布外面的那个窗口，那个窗口就是组件
        this.add(mp);
        this.setSize(1000,750);//设置窗口大小
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当点击窗口❌时，程序退出
        this.setVisible(true);//可以显示

    }
}
