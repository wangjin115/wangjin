package com.wj.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setOver(8);
        account.setPassword("000000");
        account.showInfo();
        Account account1 = new Account("dabai", 100, "000000");
        account1.showInfo();
    }
}
