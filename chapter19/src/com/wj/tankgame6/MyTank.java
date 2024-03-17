package com.wj.tankgame6;

import java.util.Vector;

/**
 * @author wj
 * @version 1.0
 */
public class MyTank extends Tank {
    Shot shot=null;
    Vector<Shot> shots=new Vector<>();

      public MyTank(int x, int y) {
        super(x, y);
    }
    public void shotMyTank(){

          //控制在面板上只有5颗子弹
        if (shots.size()==5){
            return;
        }
          switch (getDirect()){
              case 0:
                  shot=new Shot(getX()+20,getY(),0);
                  break;
              case 1:
                  shot=new Shot(getX()+60,getY()+20,1);
                  break;
              case 2:
                  shot=new Shot(getX()+20,getY()+60,2);
                  break;
              case 3:
                  shot=new Shot(getX(),getY()+20,3);
                  break;

          }
          //把创建的shot加入到shots集合中
          shots.add(shot);
        //启动shot线程
          new Thread(shot).start();
    }
}
