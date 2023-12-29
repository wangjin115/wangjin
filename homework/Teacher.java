package com.wj.homework;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    //private String grade;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void introduce(){
        System.out.println("教师"+name+"的信息如下：");
        System.out.println("姓名:"+name+"\t年龄:"+age+"\t职称:"+post+"\t基本工资:"+salary);

    }
}
