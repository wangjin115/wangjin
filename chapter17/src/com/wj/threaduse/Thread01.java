package com.wj.threaduse;

/**
 * @author wj
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        System.out.println("主线程："+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i="+i);

            Thread.sleep(1000);

        }

    }
}
class  Cat extends Thread{
    int times=0;
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵，我是小猫咪"+ ++times+"线程名："+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times==80){
                break;
            }
        }
    }
}
