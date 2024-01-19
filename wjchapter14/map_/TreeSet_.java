package com.wj.map_;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author wj
 * @version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String&& o2 instanceof String) {
                    return ((String) o1).compareTo((String) o2);
                }else
                    return 0;
            }
        });
        treeSet.add("小红");
        treeSet.add("黄黄");
        treeSet.add("大白");
        treeSet.add("a");
        treeSet.add("abc");

        System.out.println(treeSet);


    }
}
