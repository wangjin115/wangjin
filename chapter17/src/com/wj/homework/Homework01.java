package com.wj.homework;

import java.util.Queue;
import java.util.Scanner;

/**
 * @author wj
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }

}
class A extends Thread{
    private boolean loop=true;

    @Override
    public void run() {
        while (loop){
            System.out.println((int)(Math.random()*100+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Aスレッドを終了した");

    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class B extends Thread{
    private A a;
    private Scanner scanner=new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("指示を入力してください（Qは終了の意味です）：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                System.out.println("Bスレッドを終了した");
                break;

            }
        }
    }
}
