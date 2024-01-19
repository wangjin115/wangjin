package com.wj.list_;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author wj
 * @version 1.0
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        MyDate myDate = new MyDate(1, 1, 1990);
        MyDate myDate2 = new MyDate(25, 1, 1995);
        MyDate myDate3 = new MyDate(1, 1, 1990);

        hashSet.add(new Employee1("jack",8000,myDate));
        hashSet.add(new Employee1("red",8000,myDate2));
        hashSet.add(new Employee1("jack",8000,myDate3));

        System.out.println(hashSet);
    }

}
class Employee1{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee1(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Double.compare(sal, employee1.sal) == 0 && Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return year+"年"+month+"月"+day+"日";
    }
}

