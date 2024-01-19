package com.wj.homeworkchapter14;

import java.security.Key;
import java.util.*;

/**
 * @author wj
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {

        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("red",2900);

        m.put("jack",2600);
        System.out.println(m);
        Set keySet = m.keySet();
        for (Object object :keySet) {
            m.put(object,(Integer)m.get(object)+100);
//            System.out.println(object);
//            System.out.println(m.get(object));
        }
        System.out.println(m);

        Iterator iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());


        }

        Collection values = m.values();
        for (Object object :values) {
            System.out.println(object);

        }


    }
}

