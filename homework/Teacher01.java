package com.wj.homework;

public class Teacher01 extends Employee01 {
    private int classDay;
    private double classSal;
    public Teacher01(String name, double sal) {
        super(name, sal);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public double yearSal() {
        return super.yearSal()+classSal*classDay;
    }

    @Override
    public void printSal() {
        System.out.println("老师"+getName()+"年工资打印是："+(getSal()*getSalMonth()+classSal*classDay));
    }
}




