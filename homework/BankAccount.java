package com.wj.homework;

public class BankAccount {
    private double balance;


    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
//这是存钱的方法，amount是存进去的钱数，balance是余额
    public void deposit(double amount){
        balance += amount;
    }
    //这是取钱的方法
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
