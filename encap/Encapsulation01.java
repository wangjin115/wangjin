package com.wj.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(20);
        person.setSalary(8000);
        System.out.println(person.info());
//        System.out.println(person.getAge());
//        System.out.println(person.getName());
//        System.out.println(person.getSalary());
        System.out.println("====person1的信息====");
        Person person1 = new Person("ming", 320, 3000);

        System.out.println(person1.info());

    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        //校验
        if(name.length()>=2&&name.length()<=6){
            this.name = name;
        }else{
            System.out.println("名字的长度不对，需要2-6个字符，默认名字");
            this.name ="无名人";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >0 &&age<120) {
            this.age =age;
        }else{
            System.out.println("输入年龄有误，需在1-120岁之间，默认年龄18岁");
            this.age =18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
      //  return "信息为：name="+ name+"\tage="+age+"\t薪水="+salary;
        return "信息为：name="+ name+"\tage="+age+"\t薪水="+salary;
    }
}

