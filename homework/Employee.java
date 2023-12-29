package com.wj.homework;

public class Employee {
    private String name;
    private double salary;
    private double day;
    private double rank;

    public Employee(String name, double salary, double day, double rank) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public double totalsal() {
        return salary * day * rank;
    }

    public void printSal() {
        System.out.println(name + "工资是" + salary * day * rank);
    }
}
