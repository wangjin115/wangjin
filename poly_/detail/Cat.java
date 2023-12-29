package com.wj.poly_.detail;

public class Cat extends Anminal{
    int age = 5;
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//Cat 特有方法
         System.out.println("猫抓老鼠");
    }
}
