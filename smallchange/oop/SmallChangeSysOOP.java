package com.wj.smallchange.oop;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key="";
    double money = 0;
    double balance = 0;
    Date date = null;
    String note="";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //第二步完成零钱通明细，这里使用了字符串拼接，思考用对象怎么写，暂时没有思路
    String details = "----------零钱通明细----------";
//    第一步完成显示菜单
    public void mainMenu(){
        do {
            System.out.println("\n=========零钱通菜单oop=========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退  出");
            System.out.print("请选择（1-4）：");
//            用scanner接收用户输入
            key = scanner.next();
//            switch分支将用户输入情况，与情况相匹配
            switch (key) {
                case "1":
                    this.detial();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        } while (loop);
        System.out.println("--------退出了零钱通系统--------");
    }
//第二步完成显示明细
    public void detial(){
        System.out.println(details);

    }
    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
//                    这里加入了对金额的限制，注意这里的编程思想，要先写不满足条件的情况
//                    不满条件的话写完直接退出就好了，如果是写满足条件的情况要写两个分支，代码的阅读性差
        if (money <= 0) {
            System.out.println("收益入账金额应大于0");
            return; //退出方法，不再执行后面的代码
        }
        balance += money;
        date = new Date();
//                    这里注意此处引出了怎么获取时间的方法，首先定义一个时间等于空，通过new Date()获取现在的时间
//                    SimpleDateFormat格式化时间的格式
//                    format是格式化的意思，sdf.format(date)就是用sdf这个格式把date这个对象格式化成时间的格式
        //   System.out.println(sdf.format(date));
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;


    }
    public void pay(){
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应在1-" + balance + "之间");
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        //   System.out.println(sdf.format(date));
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;

    }
    public void exit(){
        String choise = "";
//      这里涉及到的编程思想是，一个代码完成一个功能，我就让他判断输入的是不是y或n这一个功能就可以
//      如果后续还让加y/n/。。。其他的可以直接在下面的if语句加
        while (true) {
            System.out.println("你确定要退出吗？y/n");
            choise = scanner.next();
            if ("y".equals(choise) || "n".equals(choise)) {
                break;
//      注意这里退出方法：break如果改成return，就退出方法了。然后就直接不执行后面的if了
            } else {
                System.out.println("您输入的信息不正确，请重新输入");
            }
        }
        if (choise.equals("y")) {
            loop = false;
        }
    }

}


