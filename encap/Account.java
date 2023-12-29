package com.wj.encap;

public class Account {

    private String name;
    private double over;
    private String password;

    public Account() {
    }

    public Account(String name, double over, String password) {
        this.setName(name);
        this.setOver(over);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() != 2 && name.length() != 3 && name.length() != 4) {
            System.out.println("名字长度有误，长度为2位3位或4位，默认值为无名");
            this.name = "无名";
        } else {
            this.name = name;
        }
    }
    public double getOver() {
        return over;
    }

    public void setOver(double over) {
        if (over < 20) {
            System.out.println("余额低于20，默认值为0");
        } else {
            this.over = over;
        }
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()!=6){
            System.out.println("密码必须为6位，默认密码是123456");
            this.password = "123456";
        }else {
            this.password = password;
        }
    }
    public void showInfo(){
        System.out.println("账号信息：名字="+name+"\t余额="+over+"\t密码="+password);
    }
}


