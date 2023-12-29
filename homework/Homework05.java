package com.wj.homework;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack", 3000);
        worker.setSalMonth(15);
        System.out.println(worker.getName()+"年工资是："+worker.yearSal());
        worker.printSal();
        Teacher01 teacher01 = new Teacher01("red", 5000);
        teacher01.setSalMonth(13);
        teacher01.setClassDay(20);
        teacher01.setClassSal(100);
        System.out.println("老师"+teacher01.getName()+"年工资是："+teacher01.yearSal());
        teacher01.printSal();
    }
}
