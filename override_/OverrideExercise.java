package com.wj.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18);
        System.out.println(jack.say());
        Student red = new Student("red", 23, 1223456, 99);
        System.out.println(red.say());
    }
}
