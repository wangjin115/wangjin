package com.wj.tankgame6;

import org.w3c.dom.Node;

import java.io.*;
import java.util.Vector;

/**
 * @author wj
 * @version 1.0
 */
public class Recorder {
    //定义变量，记录我方击毁敌人坦克数
    private static int allEnemyTankNum = 0;
    //定义IO对象, 准备写数据到文件中
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFile = "/Users/dreamtank/IdeaProjects/chapter19/src/myRecord.txt";
    //定义Vector ,指向 MyPanel 对象的 敌人坦克Vector
    private static Vector<EnemyTank> enemyTanks = null;
    //定义一个Node 的Vector ,用于保存敌人的信息node
    private static Vector<Node1> nodes = new Vector<>();

   public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
       Recorder.enemyTanks = enemyTanks;
   }

    public static String getRecordFile() {
        return recordFile;
    }

    //增加一个方法，用于读取recordFile, 恢复相关信息
    //该方法，在继续上局的时候调用即可
    public static Vector<Node1> getNodesAndEnemyTankRec() {

        try {

            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine()); //先读取一行，读出来的是字符串，字符串转成int
            //读完一行以后继续读
            //循环读取文件，生成nodes 集合
            String line = "";//255 40 0
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node1 node = new Node1(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node);//放入nodes Vector
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return nodes;
    }


    //增加一个方法，当游戏退出时，我们将allEnemyTankNum 保存到 recordFile
    //对keepRecord 进行升级, 保存敌人坦克的坐标和方向

    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write( allEnemyTankNum + "\r\n");  //"\r\n"换行
            //或者bw.newLine(); 也可以换行
            //遍历敌人坦克的Vector ,然后根据情况保存即可.
            //OOP, 定义一个属性 ，然后通过setXxx得到 敌人坦克的Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                //取出敌人坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) { //建议判断.
                    //保存该enemyTank信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    //写入到文件
                    bw.write(record + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //当我方坦克击毁一个敌人坦克，就应当 allEnemyTankNum++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}


