package com.wj.homework;

/*
3个Person对象，按年龄从小到大进行排序
 */

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 20, "打字");
        persons[1] = new Person("king", 25, "扫地");
        persons[2] = new Person("yellow", 18, "换水");
        Person temp = null;   //这里想不到要创建一个temp对象
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() > persons[j + 1].getAge()) {     //这里没有想到是这么调年龄
                    // 交换 persons[j] 和 persons[j + 1] 的位置
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
