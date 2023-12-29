package com.wj.homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        boolean loop=true;
        String details = "----------明细----------";
        Scanner scanner = new Scanner(System.in);
        String key="";
        double amount=0;
        double balance =0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        double handlingfee =0;

        do {

            System.out.println("\n=========存取款系统=========");
            System.out.println("\t\t1 明细");
            System.out.println("\t\t2 存款");
            System.out.println("\t\t3 取款");
            System.out.println("\t\t4 退  出");
            System.out.print("请选择（1-4）：");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("存款金额：");
                    amount = scanner.nextDouble();
                    handlingfee=1;
                    balance += amount-handlingfee;
                    date = new Date();
                    details += "\n存款\t+" + amount + "\t" + sdf.format(date) + "\t余额：" +( balance+handlingfee)
                    +"\n手续费\t-"+handlingfee+"\t"+ sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.print("取款金额：");
                    amount = scanner.nextDouble();
                    handlingfee=1;
                    balance -= amount+handlingfee;
                    date = new Date();
                    details += "\n取款\t-" + amount + "\t" + sdf.format(date) + "\t余额：" + (balance+handlingfee)
                            +"\n手续费\t-"+handlingfee+"\t"+ sdf.format(date) + "\t余额：" + balance;
                    break;
                case "4":
                    String choise = "";
//                    这里涉及到的编程思想是，一个代码完成一个功能，我就让他判断输入的是不是y或n

                    while (true) {
                        System.out.println("你确定要退出吗？y/n");
                        choise = scanner.next();
                        if ("y".equals(choise) || "n".equals(choise)) {
                            break;
                        } else {
                            System.out.println("您输入的信息不正确，请重新输入");
                        }
                    }
                    if (choise.equals("y")) {
                        loop = false;
                    }
                    break;

                default:
                    System.out.println("选择有误，请重新选择");
            }
        }while(loop);

        System.out.println("--------退出了零钱通系统--------");
    }
}
