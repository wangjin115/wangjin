package com.wj.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wj
 * @version 1.0
 */
public class Collection {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("black",15));
        list.add(new Dog("red",1));
        list.add(new Dog("yellow",5));
        System.out.println("使用迭代器");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("使用增强for");
        for (Object o :list) {
            System.out.println(o);

        }


    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
