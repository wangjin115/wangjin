package com.wj.exception_;

/**
 * @author wj
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
     //   int res =num1/num2;
        try {
            int res =num1/num2;
        } catch (Exception e) {
        //    throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        System.out.println("程序继续执行。。。" );
    }
}
