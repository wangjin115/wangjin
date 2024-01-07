package com.wj.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
          cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });

    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
    //new Bell传进来，运行bell.ring();运行的是InnerClassExercise02$1
    //动态绑定，所以运行的是匿名内部类里的ring方法

}