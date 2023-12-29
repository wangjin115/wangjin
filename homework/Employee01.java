package com.wj.homework;

public class Employee01 {
    private String name;
    private double sal;
    private int salMonth =12;
    public Employee01(String name, double sal) {
        this.name = name;
        this.sal = sal;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public double yearSal(){
        return sal*salMonth;
    }
    public void printSal(){
        System.out.println(name+"年工资打印是："+sal*salMonth);
    }
}
