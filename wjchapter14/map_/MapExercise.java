package com.wj.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wj
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Employee e1 = new Employee("jack", 28990, "001");
        Employee e2 = new Employee("red", 19000, "002");
        Employee e3 = new Employee("black", 5000, "003");

        Map hashMap = new HashMap();
        hashMap.put(e1.getId(),e1);
        hashMap.put(e2.getId(),e2);
        hashMap.put(e3.getId(),e3);

        System.out.println("----第一种----");
        Set keySet = hashMap.keySet();
        for (Object key :keySet) {
            Employee employee = (Employee) hashMap.get(key);
//            if (((Employee) hashMap.get(key)).getSal()>18000){
//                System.out.println(employee);
//            }
            if(employee.getSal()>18000) {
                System.out.println(key+"-"+employee);
            }

        }

        System.out.println("----第二种----");
        Set set = hashMap.entrySet();
        for (Object entry :set) {
            Map.Entry entry1 = (Map.Entry) entry;
            Employee value = (Employee) entry1.getValue();
            if (value.getSal()>18000){
                System.out.println(entry1.getKey()+"-"+value);
            }

        }
        System.out.println("----第三种----");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee value = (Employee) entry.getValue();
            if (value.getSal()>18000){
                System.out.println(entry.getKey()+"-"+value);
            }


        }


    }
}
class Employee{
    private String name;
    private double sal;
    private String id;

    public Employee(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }
}
