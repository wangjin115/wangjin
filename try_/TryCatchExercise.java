package com.wj.try_;

import java.util.Scanner;

/**
 * @author wj
 * @version 1.0
 */
/*
如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
思路：
1.创建Scanner对象
2.使用无限循环接收一个输入
3.将输入的值转成一个int
4.如果在转换时抛出异常，就说明输入的不是一个可以转成int的内容
5.如果没有抛出异常，则break该循环，并输出这个整数（实际应用的时候可以不用输出这个整数，只是为了让用户输入整数而已）
ユーザーが整数以外を入力した場合、整数を入力するまで繰り返すよう促す。
アイデア
1.スキャナ・オブジェクトを作成する。
2.無限ループを使って入力を受け取る。
3.入力値をintに変換する。
4.変換中に例外がスローされたら、入力が変換可能なint型でないことを意味する。
5.例外がスローされなければ、ループをブレイクして整数を出力する（実際には整数を出力する必要はなく、ユーザーに整数を入力させるだけでよい）。
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        while (true){
            System.out.println("请输入一个整数：");
            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数：");
            }

        }
        System.out.println("你输入的值是"+num);
    }
}
