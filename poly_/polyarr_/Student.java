package com.wj.poly_.polyarr_;

public class Student extends Person{
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
public void stdy(){
    System.out.println("学生"+getName()+"正在听课");

}
    @Override
    public String say() {
        return super.say()+"\tscore="+score;
    }
}
