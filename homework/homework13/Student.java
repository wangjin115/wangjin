package com.wj.homework.homework13;

public class Student extends Person{
    private String stu_id;
    public Student(String name, char sex, double age, String stu_id) {
        super(name, sex, age);
        this.stu_id=stu_id;
    }

    public void study(){
        System.out.println("我承诺我会好好学习");

    }
    @Override
    public String play() {
        return super.play()+"足球";
    }
    public void printInfo(){
        System.out.println("学生的信息：");
        System.out.println(basicaInfo());
        System.out.println("学号"+stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student:"+super.toString()+
                ", stu_id=" + stu_id;
    }
}

