package com.wj.tankgame7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
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

    //定义一个存放Node1对象的Vector，用于恢复敌人坦克的坐标和方向
    Vector<Node1> nodes=new Vector<>();
    //定义一个vector，用于存放炸弹
    //当子弹击中坦克时，加入一个bomb对象到bombs
    Vector<Bomb> bombs=new Vector<>();
    int enemyTankSize=3;
    //定义3张图片，用于显示爆炸效果
    Image image1=null;
    Image image2=null;
    Image image3=null;


    public MyPanel(String key){
         //先判断记录的文件是否存在
        //如果存在，就正常执行，如果文件不存在，提示，只能开启新游戏，key = "1"
        File file = new File(Recorder.getRecordFile());
        if (file.exists()) {
            nodes = Recorder.getNodesAndEnemyTankRec();
        } else {
            System.out.println("文件不存在，只能开启新的游戏");
            key = "1";
        }
    //将MyPanel对象的enemyTanks设置给Recorder的enemyTanks
        Recorder.setEnemyTanks(enemyTanks);
        myTank=new MyTank(500,100);  //初始化自己的坦克
       // myTank.setSpeed(20); 可以在更改速度
        switch (key) {
            case "1":
                enemyTanks.clear();

                //初始化敌人坦克
                for (int i = 0; i < enemyTankSize; i++) {
                    //创建一个敌人的坦克
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    //将enemyTanks 设置给 enemyTank !!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(2);
                    //启动敌人坦克线程，让他动起来
                    new Thread(enemyTank).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //加入enemyTank的Vector 成员
                    enemyTank.shots.add(shot);
                    //启动 shot 对象
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
               Recorder.resetAllEnemyTankNum();
                break;
            case "2": //继续上局游戏
                //初始化敌人坦克
                for (int i = 0; i < nodes.size(); i++) {
                    Node1 node = nodes.get(i);
                    //创建一个敌人的坦克
                    EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());
                    //将enemyTanks 设置给 enemyTank !!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(node.getDirect());
                    //启动敌人坦克线程，让他动起来
                    new Thread(enemyTank).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //加入enemyTank的Vector 成员
                    enemyTank.shots.add(shot);
                    //启动 shot 对象
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            default:
                System.out.println("你的输入有误...");
        }
       //初始化敌人的坦克
//        for (int i = 0; i < enemyTankSize; i++) {
//            //这种是直接在敌人坦克这个类里初始了方向为2，就是方向向下
//         //   enemyTanks.add(new EnemyTank(100*(i+1),0));  //i+1可以自动的给敌人的坦克错开距离
//            //这里两个写法
//            //这个写法是，创建一个敌人坦克对象，用这个对象调用setDirect方法，设置方向 为2，2就是向下
//            //再把这个敌人坦克对象加进去
//            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
//            //将enemyTanks设置给enemyTank
//            enemyTank.setEnemyTanks(enemyTanks);
//            enemyTank.setDirect(2);
//            //启动敌人坦克线程
//           new Thread(enemyTank).start();
//
//            //给敌人坦克加一个子弹
//            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
//            enemyTank.shots.add(shot);
//            new Thread(shot).start();
//
//            enemyTanks.add(enemyTank);
//
//        }
        //初始化图片对象
        image1=Toolkit.getDefaultToolkit().getImage("imgs/bomb_1.gif");
        image2=Toolkit.getDefaultToolkit().getImage("imgs/bomb_2.gif");
        image3=Toolkit.getDefaultToolkit().getImage("imgs/bomb_3.gif");

        //
        new AePlayWave("/Users/dreamtank/IdeaProjects/chapter19/src/111.wav").start();

    }
    //编写方法，显示我方击毁敌方坦克的信息
    public void showInfo(Graphics g) {

        //画出玩家的总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("您累积击毁敌方坦克", 1020, 30);
        drawTank(1020, 60, g, 0, 0);//画出一个敌方坦克，这里画坦克的时候把颜色改成蓝色了
        g.setColor(Color.BLACK);//这里需要重新设置成黑色
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);

    }


    //这里意味着我在这里画了一个画布，还画了一个坦克，再加一个坦克屏幕上就有两个坦克了
    //ここでは、キャンバスとタンクを描いたということだ。
    @Override
    public void paint(Graphics g) {   //Graphics g理解成一支画笔
        super.paint(g); //这里调用父类的初始化的同时，下面还进行了修改
        g.fillRect(0,0,1000,750);
        //这个画笔可以调用自己的方法，有很多方法，什么画圆啊，画方块啊，画线啊，很多很多很多，这里用这个方法画了个画板
        //如果这里不写，那坦克死了，也还是能画出来，所以这里限制只有在不为空，并且没有死的时候才能画出来

        showInfo(g);
        if (myTank!=null&&myTank.isLive){
        drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirect(),1);
        }
        //这相当于把画坦克的方法封装到drawTank里了，在这调用这个方法就可以画个坦克出来了
        //画出我的坦克射击的子弹
//        if (myTank.shot !=null&&myTank.shot.isLive==true){
//           // g.fill3DRect(myTank.shot.x,myTank.shot.y,4,4,false);
//            g.draw3DRect(myTank.shot.x,myTank.shot.y,2,2,false);
//        }
        //这里需要改进，让我的坦克发射出多颗子弹
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot=myTank.shots.get(i);
            if (shot !=null&&shot.isLive){
                g.draw3DRect(shot.x,shot.y,2,2,false);
            }else {//如果该shot对象无效，就从shots集合中拿掉
                myTank.shots.remove(shot);
            }

        }

        //如果bombs集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb=bombs.get(i);
            //根据当前的bombs对象的life值去画出对应的图片
            if (bomb.life>6){
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            }else if (bomb.life>3){
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            }else {
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
            //让这个炸弹的生命值减少
            bomb.lifeDown();
            //如果bomb的life为0，就从bombs的集合中删除
            if (bomb.life==0){
                bombs.remove(bomb);
            }

        }

        //画出敌人坦克，遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {

            EnemyTank enemyTank=enemyTanks.get(i);
            //判断敌人坦克是否活着，活着才画
            if (enemyTank.isLive){
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
            //画出enemyTank所有子弹
            for (int j=0;j<enemyTank.shots.size();j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //绘制
                if (shot.isLive) {
                    g.draw3DRect(shot.x, shot.y, 1, 1, false);
                } else {
                    enemyTank.shots.remove(shot);

                }
            }
            }else {
                enemyTanks.remove(enemyTank);
            }
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
            if (myTank.getY()>0) {
                myTank.moveUp();
            }
            //myTank.setY(Math.max(0, getY()- speed));
        } else if (e.getKeyCode()==KeyEvent.VK_D) {
            myTank.setDirect(1);
            if (myTank.getX()+60<1000) {
                myTank.moveRight();
            }
          //  myTank.setX(Math.min(getWidth() - 60, getX() + speed));
        } else if (e.getKeyCode()==KeyEvent.VK_S) {
            myTank.setDirect(2);
            if (myTank.getY()+60<750){
                myTank.moveDown();
            }

          //  myTank.setY(Math.min(getHeight()-60,getX()+speed));
        } else if (e.getKeyCode()==KeyEvent.VK_A) {
            myTank.setDirect(3);
            if(myTank.getX()>0) {
                myTank.moveLeft();
            }
           // myTank.setY(Math.max(0, getX() - speed));
        }
        if (e.getKeyCode()==KeyEvent.VK_J){
            //判断我方的子弹是否销毁  发射一颗子弹
//            if (myTank.shot==null||!myTank.shot.isLive) {
//                //意思是当子弹是空，也就是一开始的时候，或者子弹死了，取反就变成true了，所以就可以调用shotMyTank()方法
//                //按J就可以发射子弹了
//                myTank.shotMyTank();
//            }
            //发射多颗子弹
            myTank.shotMyTank();
        }
        //当方向改变完成后，还有两步操作，一个是让TankGame跟KeyListener建立联系，一个是重新绘制面板
        this.repaint();

    }

    public void hitEnemyTank(){

        for (int j = 0; j < myTank.shots.size(); j++) {
            Shot shot=myTank.shots.get(j);
            //判断是否击中敌人坦克
            if (shot != null && shot.isLive) {
                //当我的子弹还活着，或者子弹不为空的时候，我的子弹一开始就被创建了，所以就会进行这个线程
                // 这个地方没明白，为什么不加这个空，所有的都异常，要点键盘的按键才会动
                //遍历敌人所有坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(shot, enemyTank);
                }
            }
        }
        //            //判断是否击中敌人坦克  单颗子弹
//            if (myTank.shot!=null&&myTank.shot.isLive){
//                //当我的子弹还活着，或者子弹不为空的时候，我的子弹一开始就被创建了，所以就会进行这个线程
//                // 这个地方没明白，为什么不加这个空，所有的都异常，要点键盘的按键才会动
//                //遍历敌人所有坦克
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank=enemyTanks.get(i);
//                    hitTank(myTank.shot,enemyTank);
//                }
//            }

    }
    //编写方法，判断敌人坦克是否击中我的坦克
    public void hitMyTank(){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (myTank.isLive&&shot.isLive){
                    hitTank(shot,myTank);
                }

            }

        }

    }
    //编写方法，判断我方的子弹是否击中敌人坦克
    public void hitTank(Shot s, Tank Tank){//这个方法用来判断子弹和坦克的碰撞，所以改成父类，做一个向上转型
        //判断s击中坦克
        switch (Tank.getDirect()){
            case 0:
            case 2:
                if (s.x>Tank.getX()&&s.x<Tank.getX()+40
                        &&s.y>Tank.getY()&&s.y<Tank.getY()+60){
                    s.isLive=false;
                    Tank.isLive=false;
                    //当我的子弹击中敌人坦克后，将enemyTank从集合中拿掉
                    enemyTanks.remove(Tank);
                    //当我方击毁一个敌人坦克时，就对数据allEnemyTankNum++
                    //解读, 因为 Tank 可以是 MyTank 也可以是 EnemyTank
                    if (Tank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //被击中的时候就，创建一个bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(Tank.getX(), Tank.getY());
                    bombs.add(bomb);

                }
                break;
            case 1:
            case 3:
                if (s.x>Tank.getX()&&s.x<Tank.getX()+60
                &&s.y>Tank.getY()&&s.y<Tank.getY()+40){
                    s.isLive=false;
                    Tank.isLive=false;
                    enemyTanks.remove(Tank);
                    //当我方击毁一个敌人坦克时，就对数据allEnemyTankNum++
                    //解读, 因为 Tank 可以是 MyTank 也可以是 EnemyTank
                    if (Tank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //被击中的时候就，创建一个bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(Tank.getX(), Tank.getY());
                    bombs.add(bomb);

                }
                break;
        }
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

//判断是否击中敌人坦克
            hitEnemyTank();
            //判断是否击中我方坦克
            hitMyTank();
            this.repaint();
        }
    }
}


