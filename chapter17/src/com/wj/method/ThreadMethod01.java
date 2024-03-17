package com.wj.method;

/**
 * @author wj
 * @version 1.0
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("老韩");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        System.out.println(t.getName());

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
        }
        System.out.println(t.getName()+"优先级"+t.getPriority());

        t.interrupt();
    }
}
class T extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"吃包子"+i);
            }
            System.out.println(Thread.currentThread().getName()+"休眠中");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"被中止");
            }
        }
    }
}