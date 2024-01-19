package com.wj.generic;

import java.util.*;

/**
 * @author wj
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("red",20));
        students.add(new Student("tom",19));
        for (Student student :students) {
            System.out.println(student);

        }
       // HashMap<String, Student> hm = new HashMap<String, Student>();
        //avaコンパイラーは、右側のジェネリックの型から左側のジェネリックの型を自動的に推測するので、コードがすっきりする。
        HashMap<String, Student> hm = new HashMap<>();
        hm.put("red",new Student("red",20));
        hm.put("jack",new Student("jack",18));
        hm.put("tom",new Student("tom",19));
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        System.out.println("----------------");
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }


    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
