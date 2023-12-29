package com.wj.object_;

import javax.xml.namespace.QName;

public class ToString {
    public static void main(String[] args) {
        Moster moster = new Moster("jack","巡山",2000);
        System.out.println(moster.toString()+"hashcode"+moster.hashCode());
        System.out.println(moster);
//        当直接输出一个对象时，tostring会被默认调用
    }


}
class Moster {
    private String name;
    private String job;
    private double sal;

    public Moster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
//tostring可以重写
    @Override
    public String toString() {
        return "Moster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}