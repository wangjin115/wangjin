package com.wj.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        System.out.println("========");
        //其他外部类调内部类，
        System.out.println("====第一种====");
        Outer08.Inner08 inner08 = outer08.new Inner08();
        //相当于我用外部类创建的对象去调用成员，调用的是内部类创建的成员
        inner08.say();
        System.out.println("====第二种====");
        //在外部类编写一个方法，可以返回Inner08对象，看第35行
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
        System.out.println("====第三种====");
        //这跟第一种是一个意思，就是第一种是用前面的名字调，这个用后面的调
        Outer08.Inner08 inner081 = new Outer08().new Inner08();
        inner081.say();

    }
}
class Outer08{
    private int n1=10;
    public String name="张三";
    public void say(){
        System.out.println("say");


    }
    public class Inner08{
        private int n1=100;
        public void say(){
            System.out.println(n1+name+Outer08.this.n1);
            Outer08.this.say();
        }

    }
    public Inner08 getInner08Instance(){
        Inner08 inner08 = new Inner08();
        return inner08;
       // return new Inner08();
        // 注意：new Inner08（）这才是一个对象/实例，直接写Inner08不是对象
        //上下两种方法一致
    }

    public void t1(){
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.n1);  //私有的也可以是因为他们在同一个类中

    }
}