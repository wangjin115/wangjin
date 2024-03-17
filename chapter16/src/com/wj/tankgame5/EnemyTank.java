package com.wj.tankgame5;

import java.util.Vector;

/**
 * @author wj
 * @version 1.0
 */
public class EnemyTank extends Tank implements Runnable{
    Vector<Shot> shots=new Vector<>();
    boolean isLive=true;


   // private int direct=2;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true){
            if (isLive&&shots.size()<1){
                Shot s=null;
                switch (getDirect()){
                    case 0:
                        s =new Shot(getX()+20,getY(),0);
                        break;
                    case 1:
                        s =new Shot(getX()+60,getY()+20,1);
                        break;
                    case 2:
                        s =new Shot(getX()+20,getY()+60,2);
                        break;
                    case 3:
                        s =new Shot(getX(),getY()+20,3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();

            }
            //根据坦克的方向继续移动
            switch (getDirect()){
                case 0:
                    //让坦克保持一个方向走30步
                    for (int i = 0; i < 30; i++) {
                        if (getY()>0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;

                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX()+60<1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < 30; i++) {
                        if(getY()+60<750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX()>0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }

            // 随机改变方向
            setDirect((int)(Math.random()*4));
            //写并发程序，要考虑清楚该线程什么时候结束
            if (!isLive){   //也就是isLive变成❌就退出
                break;
            }
        }
    }
//     @Override
//    public int getDirect() {
//        return direct;
//    }
//
//    @Override
//    public void setDirect(int direct) {
//        this.direct = direct;
//    }

}
