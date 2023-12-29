package com.wj.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("jack", 300, 20, 1.2, 5000);
        System.out.println(manager.getName() + "的工资是" + manager.totalsal());
        manager.printSal();
    }


}
