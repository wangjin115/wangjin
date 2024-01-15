package com.wj.homework;

/**
 * @author wj
 * @version 1.0
 */

//将字符串中的指定部分进行反转
public class Homework01 {
    public static void main(String[] args) {

        String str = "abcdef";
        System.out.println("转换前的字符串是："+str);
        try {
           str= reverse(str, 1, 4);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("转换后的字符串是："+str);



    }
    public static String reverse(String str ,int start ,int end){
        if (!(str != null&&start>=0&&end>start&&end<str.length()) ){
            throw new RuntimeException("输入参数格式有误");
        }
        char[] chars =str.toCharArray();
        for (int i = start,j=end; i < j; i++,j--) {
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
        return new String(chars);
       //return chars.toString();  这个返回的是数组对象的默认字符串表示形式
    }
}
