package com.wj.homework;

import java.util.Scanner;

/**
 * @author wj
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String name;
        String password;
        String email;

        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("请输入用户名：");
         name = scanner.nextLine();

            try {
                validateUsername(name);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
        System.out.println("请输入密码：");
         password = scanner.nextLine();

            try {
                validatePassword(password);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
        System.out.println("请输入邮箱：");
         email = scanner.nextLine();

            try {
                validateEmail(email);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            userRegister(name,password,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void userRegister(String name,String password,String email) {
//        if (!(name.length() >= 2 && name.length() <= 4)) {
//            throw new RuntimeException("用户名长度为2或3或4");
//        }
        validateUsername(name);

//        if (!(password.length() == 6 &&isDigital(password)) ){
//            throw new RuntimeException("密码长度为6，要求全是数字");
//        }
//        if(! (Integer.valueOf(password)==6)){
//            throw new RuntimeException("密码格式不正确");
//        }
        validatePassword(password);

//        int i=email.indexOf('@');
//        int j=email.indexOf('.');
//        if(! (i>0&&j>i)){
//            throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
//        }
        validateEmail(email);

    }
    public static void validateEmail(String email){
        int i=email.indexOf('@');
        int j=email.indexOf('.');
        if(! (i>0&&j>i)){
            throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
        }
    }
    public static void validatePassword(String password){
       if (!num(password)){
           throw new RuntimeException("密码长度为6，要求全是数字");
       }
//        if(! (password.length() == 6 &&isDigital(password)) ){
//            throw new RuntimeException("密码长度为6，要求全是数字");
//        }
    }
    public static void validateUsername(String name) {
        if (name==null||!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }
    }
    public static boolean num(String password){

        char[]chars =password.toCharArray();
        int[]ints=new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i]=Integer.valueOf(chars[i]);
        }
        if (ints.length==6){
            return true;
        }
        else {
        return false;}
    }
    public static boolean isDigital(String password){
        char[]chars =password.toCharArray();
        for (int i = 0; i <chars.length; i++) {
            if (chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;

    }



}
