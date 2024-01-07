package com.wj.innerclass;

public class innerClass01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.m1();
      //  outer01.getN1();
                //通过get和set只能是属性，私有方法没有办法调用
        //这地方的好处是原本通过对象直接访问m2是不可以的，因为m2是私有的，
        //但是通过内部类的调用就可以访问到m2了

    }
}
class Outer01{
    private int n1=100;
    private void m2(){
        int n1=0;
        System.out.println("Outer02 m2()");
    }
    //这种方法里面定义的变量叫做局部变量，就在这个方法内有效，出了方法就不能用了
    // 所以下面调用n1也没他们的事
    public void m3(){
        int n1=0;
    }
    public void m1(){
        class Inner01{
            private int n1=800;
            private void m2(){


            }
            public void f1(){
                System.out.println(n1+Outer01.this.n1);
                m2();
                //这地方Outer01.this.n1可以理解成我创建了一个Outer01对象，然后调用了它的n1
                Outer01.this.m2();
                //这样就是如果有两个相同命名的方法的时候就这么调用

            }
        }
        Inner01 inner01 = new Inner01();
        inner01.f1();

    }


}