package com.wj.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
       new C().pX();

    }
}
interface A{
    int x=0;
}
class B{
     int x=1;
}
class C extends B implements A{
    public C() {
    }

    //  int x=3;
    public void pX(){
        C c = new C();
        System.out.println(A.x+" "+super.x);
      //   this.x + x
        //我觉得这个地方就是他在自己的类里找不到就出去了，
        // 出去之后父类和接口里都有x，所以不知道先调谁，跟直接写x的情况差不多

         //???为什么
    }
}