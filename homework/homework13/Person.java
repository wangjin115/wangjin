package com.wj.homework.homework13;

public class Person {
    private String name;
    private char sex;
    private double age;


    public Person(String name, char sex, double age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }




    public String play(){
        return getName()+"爱玩";
    }

    public String basicaInfo(){
        return "姓名："+name+"\n年龄："+age+"\n性别："+sex;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", sex=" + sex +
                ", age=" + age;
    }
}
