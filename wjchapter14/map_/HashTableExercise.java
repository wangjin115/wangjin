package com.wj.map_;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author wj
 * @version 1.0
 */
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
       // hashtable.put(null,100);
       // hashtable.put("john",null);
        hashtable.put("lucy",100);
        hashtable.put("lic",100);
        hashtable.put("lic",88);
        System.out.println(hashtable);
    }
}
