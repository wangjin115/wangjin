package com.wj.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wj
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println("list"+list);
        list.add(1,"hi");
        System.out.println("list"+list);
        System.out.println("第五个元素："+list.get(4));
        list.remove(5);
        System.out.println("list"+list);
        list.set(6,"ok");
        System.out.println("list"+list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}
