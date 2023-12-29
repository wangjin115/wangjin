package com.wj.homework;

public class Professor extends Teacher{
    private double salary;
    private String grade;

    public Professor(String name, int age, String post, double salary,String grade) {
        super(name, age, post, salary);
        this.grade=grade;
        this.salary=salary*1.3;
    }

    @Override
    public void introduce() {
        System.out.println(grade+getName()+"的信息如下：");
        System.out.println("姓名:"+getName()+"\t年龄:"+getAge()+"\t职称:"+getPost()+"\t基本工资:"+salary);

    }
}






