package com.wj.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author wj
 * @version 1.0
 */
public class GenericExercise01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",8000,new Date1(5,20,1990)));
        employees.add(new Employee("red",6000,new Date1(3,25,1995)));
        employees.add(new Employee("jack",9000,new Date1(4,20,1989)));

        System.out.println(employees);
        //カスタムsortメソッド
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //まず、タイプを判定する
                if (!(emp1 instanceof Employee&& emp2 instanceof Employee)) {
                    System.out.println("不正なタイプ。。");
                    return 0;
                }
                //compareToを使って名前を判定する
                int i = emp1.getName().compareTo(emp2.getName());
                if (i!=0 ){
                    return i;
                }
                //名前が同じ場合は、給与を判定する
                double i1=emp1.getSal()-emp2.getSal();
                if (i1 !=0){
                    return (int)i1;
                }
                //名前と給与両方が同じ場合は、誕生日を判定する
                //誕生日は、年、月、日の手順について、判定する
               return emp1.getBirthday().compareTo(emp2.getBirthday());
                //ここに書くには複雑すぎるので、以下のDate１クラスに書いておく。
//                  int yearMinus =emp1.getBirthday().getYear()-emp2.getBirthday().getYear();
//                  if (yearMinus != 0){
//                       return yearMinus;
//                  }
//                  int monthMinus =emp1.getBirthday().getMonth()-emp2.getBirthday().getMonth();
//                  if (monthMinus !=0){
//                      return monthMinus;
//                  }
//                  return emp1.getBirthday().getDay()-emp2.getBirthday().getDay();

            }
        });
        System.out.println("----------------");
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private double sal;
    private Date1 birthday;

    public Employee(String name, double sal, Date1 birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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

    public Date1 getBirthday() {
        return birthday;
    }

    public void setBirthday(Date1 birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class Date1 implements Comparable<Date1>{
    private int month;
    private int day;
    private int year;

    public Date1(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return year +"-"+month+"-"+day;
    }
    public int compareTo(Date1 o){
        int yearMinus =year-o.getYear();
        if (yearMinus != 0){
            return yearMinus;
        }
        int monthMinus =month-o.getMonth();
        if (monthMinus !=0){
            return monthMinus;
        }
        return day-o.getDay();

    }
}