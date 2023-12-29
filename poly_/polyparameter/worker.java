package com.wj.poly_.polyparameter;

public class worker extends Employee{
    public worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工"+getName()+"正在工作 ");
    }

    @Override
    public double getAnnual() {  //普通员工没有奖金，只调用薪资就行

        return super.getAnnual();
    }
}
