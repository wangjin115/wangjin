package com.wj.poly_.polyparameter;

public class PloyParameter {
    public static void main(String[] args) {
        worker worker1 = new worker("jack", 2500);
        Manager manager = new Manager("milan",8000,100000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpannual(worker1);
//        PloyParameter ployParameter1 = new PloyParameter();
       ployParameter.showEmpannual(manager);


    }
    public void showEmpannual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWord(Employee e){
        if(e instanceof worker){
            ((worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();

        }else {

        }
    }
}
