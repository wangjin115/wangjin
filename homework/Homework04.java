package com.wj.homework;

import java.time.format.DateTimeFormatter;

/**
 * @author wj
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
       String s1="hap" ;
       String t1="hi"+s1;
      // String t2="hihap";
       System.out.println(t1.intern()==t1);
      // System.out.println(t1==t2);
       // System.out.println(t1.intern()==t2);

    }

}

