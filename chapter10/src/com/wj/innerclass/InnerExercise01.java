package com.wj.innerclass;

public class InnerExercise01 {
    public static void main(String[] args) {
        //  Tiger tiger = new Tiger();
        //  tiger.cry();
        Outer02 outer02 = new Outer02();
        outer02.method();
        Father father =new Father("jack"){

        };
        System.out.println("Father "+father.getClass());
    }
}

class Outer02{
    private int n1=10;
    public void method(){
        IA tiger=new IA(){
            public void cry() {
                System.out.println("叫唤");
            }
        };
        tiger.cry();
        System.out.println("IA "+tiger.getClass());
    }

    }

interface IA{
public void cry();
}
//class Tiger implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("叫唤");
//    }
//}
class Father{
    public Father(String name) {
    }
    public void test(){

    }
}