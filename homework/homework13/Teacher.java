package com.wj.homework.homework13;

public class Teacher extends Person {
    private int work_age;
    public Teacher(String name, char sex, double age, int work_age) {
        super(name, sex, age);
        this.work_age=work_age;
    }
    public void teach(){
        System.out.println("我承诺我会好好教学");
    }
    @Override
    public String play() {
        return super.play()+"象棋";
    }
    public void printInfo(){
        System.out.println("老师的信息：");
        System.out.println(basicaInfo());
        System.out.println("工龄"+work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher:"+super.toString()+
                ", work_age=" + work_age
               ;
    }
}
