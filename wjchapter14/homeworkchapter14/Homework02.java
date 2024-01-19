package com.wj.homeworkchapter14;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wj
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("---複数の要素を追加する---");
        Car car = new Car("ビーエムダブリュー", 400000);
        Car car1 = new Car("アウディ", 500000);
        Car car2 = new Car("ベンツ", 600000);
        list.add(car);
        list.add(car1);
        list.add(car2);
        System.out.println(list);
        System.out.println("---指定された要素を削除する---");
        list.remove(2);
        list.remove(car);
        System.out.println(list);
        System.out.println("---特定の要素が存在するかどうかを検索する---");
        System.out.println(list.contains(car1));
        System.out.println(list.contains(car));
        System.out.println("---要素の数を取得する---");
        System.out.println("size="+list.size());
        System.out.println("---空であるかどうかを判断する---");
        System.out.println(list.isEmpty());
        //クリアする
       // list.clear();
        //System.out.println(list);
        System.out.println("---複数の要素を追加する---");
        list.addAll(list);
        System.out.println(list);
        System.out.println("---複数の要素が存在するかどうかを検索する---");
        System.out.println(list.containsAll(list));
       // System.out.println("複数の要素を削除する");
       // list.removeAll(list);
       // System.out.println(list);
        System.out.println("---------");
        for (Object object :list) {
            System.out.println(object);
        }
        System.out.println("---------");
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
        System.out.println("---------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }


    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
