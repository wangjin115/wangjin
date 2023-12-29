package com.wj.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c=b;

        System.out.println(a==c);
        System.out.println(b==c);
        B bObj =a;
        System.out.println(bObj==c);
        int num1 =10;
        double num2 =10;
        System.out.println(num1==num2);
        "hello".equals("abc");

        Integer i = 2000;

        String king = new String("king");

    }
}
class A extends B{

}
class B{

}


