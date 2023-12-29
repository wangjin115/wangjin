package com.wj.poly_.detail;

public class PolyDetail {
    public static void main(String[] args) {
        Anminal anminal = new Cat();

        System.out.println("====向上====");
        System.out.println(anminal.age);    //属性是看编译类型
        anminal.eat();
        anminal.run();
        System.out.println("====向下====");

        Cat cat1 = (Cat) anminal;
        System.out.println(cat1.age);
        cat1.catchMouse();
        cat1.eat();
        cat1.run();

    }
}
