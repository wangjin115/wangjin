package com.wj.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wj
 * @version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1" ,"jack");
        map.put("no2","red");
        map.put("no1","yellow");
        map.put(1,"yellow");

        Set keySet = map.keySet();
        //都是通过取出key，遍历得到key之后再调出value
        System.out.println("----第一种----");
        for (Object key :keySet) {
            System.out.println(key+"-"+map.get(key));
        }

        System.out.println("----第二种----");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"-"+map.get(key));
        }

        System.out.println("----第三种----");

        Set set = map.entrySet();
       // System.out.println(set.getClass());
        //运行类型是HashMap$EntrySet，EntrySet是一个HashMap内部类
        for (Object object :set) {
          //  System.out.println(object.getClass());
            //运行类型是HashMap$Node，node真实存在还是在node中，这可以理解成地址吧
            //方便遍历
            //从HashMap$Node取出k-v
            //向下转型
            Map.Entry entry = (Map.Entry) object;
            System.out.println( entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("----第四种----");
        //在第三种的基础上写的，iterator1是entry，
        // Object entry= iterator1.next()；先给他向上转型了
        //Map.Entry m = (Map.Entry) entry;这又向下转型了
        //转成Entry类型调用getKey()，getValue()方法
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Object entry = iterator1.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }


        System.out.println(map.get("no2"));
        System.out.println(map);

    }
}
