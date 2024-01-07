package com.wj.innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.eat();
        Outer10.Inner10.say();//静态内部类里的静态成员可以通过这种方法调
        Outer10 outer10 = new Outer10();
        outer10.drink();
        outer10.getInner10Instance().eat();
        outer10.getInner10Instance().say();
        //静态的通过类名直接调
        Outer10.getInner10Instance01().eat();
        Outer10.getInner10Instance01().say();
    }
}
class Outer10{
public static void drink(){

}
static int a=10;
    public static class Inner10{
        public void eat(){

        }
        public static void say(){

        }

    }
    public Inner10 getInner10Instance(){
        return new Inner10();
    }
    public static Inner10 getInner10Instance01(){
        return new Inner10();
    }

    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.eat();
        inner10.say();

       //Inner10.say();
    }
}