package com.wj.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
//        IL il = new Picture();
//        il.show();
        f1(new Picture());
        //用这种方法所有的对象输出的都是一样的，这个有复用性
        // 如果你改了输出语句，那所有的对象的输出语句都是修改的
        // 如果需要反复用到这个picture方法的话，这个好，还是要看需求

        f1(new IL() {
            @Override
            public void show() {
                System.out.println("匿名内部类方法：这是一副名画。。");
            }
        });//用这个方法每个对象可以在自己的匿名内部类里改show，各有各的好处
        //匿名内部类又相当于一个对象，相当于把这个对象传到了实参，
        //但是他又相当于一个类，这个对象就调用类里面的方法了
    }

    public static void f1(IL il){
        il.show();
    }
}

interface IL{
    void show();
}
//传统方法
class Picture implements IL{

    @Override
    public void show() {
        System.out.println("传统方法：这是一副名画。。");
    }
}
