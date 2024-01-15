package com.wj.homework;

import java.util.Scanner;

/**
 * @author wj
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
while (true) {
    try {
        System.out.println("请输入姓名：");
        name = scanner.nextLine();
        printName(name);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    //name = scanner.nextLine();
    //  String name="tom";
}


    }
    public static void printName(String str){
        if ("null".equals(str)|| str.trim().isEmpty()){
            throw new RuntimeException("str 不能为空");
//            System.out.println("str 不能为空");
//            return;
        }
        String[] names = str.split(" ");
        if (names.length!=3){
            throw new RuntimeException("输入的字符串格式不正确");
//            System.out.println("输入的字符串格式不正确");
//            return;
        }
        String format = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);

    }
}

