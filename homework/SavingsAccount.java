package com.wj.homework;

public class SavingsAccount extends BankAccount{

    private int count=3;
    private double rate=0.01;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void earnMonthlylnterest(){
       count=3;
       super.deposit(getBalance()*rate);
       //这里其实就相当于我把利息存进去了，所以用的是存钱的方法，并且调用的是父类的方法，不会-1美元，这个方法比较巧妙
     //  setBalance(getBalance()+getBalance()*rate);
    }
    @Override
    public void deposit(double amount) {
        if(count>0){
            super.deposit(amount);
        }else {
            super.deposit(amount-1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count>0){
            super.withdraw(amount);
        }else {
            super.withdraw(amount+1);
        }
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

