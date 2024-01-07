package com.wj.interface_;

public class interfaceDetail01 {
    public static void main(String[] args) {


    }
}
interface IA{
    //void say();
    void hi();
   default void say(){

    }
}
interface IB {
    void say();
    //  default void say(){
//}
    }
class Cat implements IA,IB{


    @Override
    public void say() {
        IA.super.say();
    }

    @Override
    public void hi() {

    }
}