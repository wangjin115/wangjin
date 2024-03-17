package com.wj.tankgame6;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @author wj
 * @version 1.0
 */
public class TankGame06 extends JFrame {
    //TankGame01是游戏窗口

    //初始化面板
    MyPanel mp=null;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        TankGame06 tankGame01 = new TankGame06();
        //这里就相当于把游戏窗口调出来，有什么需要在窗口执行的操作就在下面构造器里设置

    }
    public TankGame06(){
        System.out.println("请输入选择 1:新游戏 2:继续上局");
        String key = scanner.next();
        mp=new MyPanel(key);  //mp是游戏面板（也就是绘图区域），把面板放到窗口
        //为什么我在这创建一个mp对象，他里面的paint方法就会跟着执行呢
        // 是因为系统默认，在构造组件的时候会执行一次paint方法
        // TankGame02就是组件，就是包着画布外面的那个窗口，那个窗口就是组件

        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//mp是游戏面板（也就是绘图区域），把面板放到窗口
        this.setSize(1300,1000);//设置窗口大小
        this.addKeyListener(mp); //这里就是第二步让TankGame跟KeyListener建立联系
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当点击窗口❌时，程序退出
        this.setVisible(true);//可以显示

        //在JFrame中增加相应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //System.out.println("监听到关闭窗口了");
                Recorder.keepRecord();
                System.exit(0);
            }
        });

    }
}
