package com.wj.homework;

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, double day, double rank,double bonus) {
        super(name, salary, day, rank);
        this.bonus=bonus;
    }

    @Override
    public double totalsal() {
       return super.totalsal()+bonus;

    }

    @Override
    public void printSal() {
        System.out.println("经理"+getName()+"工资是"+(bonus+getDay()*getSalary()*getRank()));
    }
}
