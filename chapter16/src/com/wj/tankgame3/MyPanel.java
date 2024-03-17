package com.wj.tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author wj
 * @version 1.0
 */
public class MyPanel extends JPanel implements KeyListener,Runnable {    //这个键盘监听我理解为在这个画布里按键盘发生的事件
//定义我的坦克
    MyTank myTank=null;
    //定义敌人的坦克，放到集合中
    Vector<EnemyTank> enemyTanks=new Vector<>();
     int enemyTankSize=3;

    public MyPanel(){
        myTank=new MyTank(100,100);  //初始化自己的坦克
       // myTank.setSpeed(20);
       //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //这种是直接在敌人坦克这个类里初始了方向为2，就是方向向下
            enemyTanks.add(new EnemyTank(100*(i+1),0));
            //这里两个写法
            //这个写法是，创建一个敌人坦克对象，用这个对象调用setDirect方法，设置方向 为2，2就是向下
            //再把这个敌人坦克对象加进去
//            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
//            enemyTank.setDirect(2);
//            enemyTanks.add(enemyTank);

        }

    }

    //这里意味着我在这里画了一个画布，还画了一个坦克，再加一个坦克屏幕上就有两个坦克了
    //ここでは、キャンバスとタンクを描いたということだ。
    @Override
    public void paint(Graphics g) {   //Graphics g理解成一支画笔
        super.paint(g); //这里调用父类的初始化的同时，下面还进行了修改
        g.fillRect(0,0,1000,750);
        //这个画笔可以调用自己的方法，有很多方法，什么画圆啊，画方块啊，画线啊，很多很多很多，这里用这个方法画了个画板
        drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirect(),1);
        //这相当于把画坦克的方法封装到drawTank里了，在这调用这个方法就可以画个坦克出来了
        if (myTank.shot !=null&&myTank.shot.isLive==true){
           // g.fill3DRect(myTank.shot.x,myTank.shot.y,4,4,false);
            g.draw3DRect(myTank.shot.x,myTank.shot.y,2,2,false);
        }

        //
        for (int i = 0; i < enemyTanks.size(); i++) {

            EnemyTank enemyTank=enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
        }



    }

    /**
     *
     * @param x タンクの左上隅の水平座標
     * @param y タンク左上隅の垂直座標
     * @param g ブラシ
     * @param direct タンクの方向（上、下、左、右）
     * @param type タンクタイプ
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
        //0:上　１：左　２：下　３：右
        switch (direct){
            case 0:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.fill3DRect(x+18,y,4,30,false);
               // g.drawLine(x+20,y,x+20,y+30);
                break;
            case 1:
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.fill3DRect(x+30,y+18,30,4,false);
                // g.drawLine(x+30,y,x+60,y+20);
                break;
            case 2:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.fill3DRect(x+18,y+30,4,30,false);
                // g.drawLine(x+20,y+30,x+20,y+60);
                break;
            case 3:
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.fill3DRect(x,y+18,30,4,false);
                // g.drawLine(x+30,y+20,x+60,y+20);
                break;

            default:
                System.out.println("waiting...");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
//キーボードのwasdキー押下を処理する
    @Override
    public void keyPressed(KeyEvent e) {
        //具体的键值常量定义在 KeyEvent 类中，以 VK_ 开头，后面跟随键名的大写字母或数字。
        //e.getKeyCode() 是 KeyEvent 类中的方法，用于获取产生键盘事件的键的键码
        //e.getKeyCode()==KeyEvent.VK_W 就是在检查在键盘上触发的按键是不是 "W" 。
        // 如果是，就执行 myTank.setDirect(0); 操作
        if (e.getKeyCode()==KeyEvent.VK_W){
            //改变坦克的方向
            myTank.setDirect(0);
            //改变坦克的坐标
            myTank.moveUp();
            //myTank.setY(Math.max(0, getY()- speed));
        } else if (e.getKeyCode()==KeyEvent.VK_D) {
            myTank.setDirect(1);
            myTank.moveRight();
          //  myTank.setX(Math.min(getWidth() - 60, getX() + speed));
        } else if (e.getKeyCode()==KeyEvent.VK_S) {
            myTank.setDirect(2);
            myTank.moveDown();
          //  myTank.setY(Math.min(getHeight()-60,getX()+speed));
        } else if (e.getKeyCode()==KeyEvent.VK_A) {
            myTank.setDirect(3);
            myTank.moveLeft();
           // myTank.setY(Math.max(0, getX() - speed));
        }
        if (e.getKeyCode()==KeyEvent.VK_J){
            System.out.println("用户按下了J，开始射击");
            myTank.shotMyTank();
        }
        //当方向改变完成后，还有两步操作，一个是让TankGame跟KeyListener建立联系，一个是重新绘制面板
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.repaint();
        }
    }
}


