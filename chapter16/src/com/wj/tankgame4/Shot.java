package com.wj.tankgame4;

/**
 * @author wj
 * @version 1.0
 */
public class Shot implements Runnable{
    int x;
    int y;
    int direct=0;
    int speed=2;
    boolean isLive =true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direct){
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            System.out.println("子弹 x="+x+"y="+y);
            //当子弹移动到面板的边界时，就应该销毁
            //碰到敌人坦克时也要销毁
            if (!(x>=0&&x<=1000&&y>=0&& y<=750&&isLive)){
                System.out.println("子弹线程退出");
                isLive=false;
               // System.out.println("子弹线程退出");
                break;

            }
        }

    }
}
