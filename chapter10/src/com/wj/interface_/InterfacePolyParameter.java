package com.wj.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if1 = new Monster();
        if1=new Car();
        AAA a=new BBB();
        a=new CCC();
        IG ig=new Monster();
    }
}

interface IG {}
interface IF extends IG{ }  //接口多态的传递
class Monster implements IF{ }
class Car implements IF{ }
class AAA{}
class BBB extends AAA{ }
class CCC extends AAA{}