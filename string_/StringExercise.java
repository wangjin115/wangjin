package com.wj.string_;

/**
 * @author wj
 * @version 1.0
 */
public class StringExercise {
    public static void main(String[] args) {
        Test ex=new Test();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+"and");
        System.out.println(ex.ch);
    }
}
class Test{
    String str =new String("wj");
    final char[] ch={'j','a','v','a'};
    public void change(String str,char ch[]){
        str="java"; //这个输出wjandhava


     //   str =new String("java");  //这个输出wjandhava
        //   this.str="java";    //这个输出javaandhava
//为什么前两个的str没有变呢，是因为在调用change这个方法的时候开了一个新栈，第一个相当于在常量池里又开了一个“java”
        //但是当这个方法运行完以后，这个栈就消失了，再去打印调用的时候还是调用的主方法里的str，并没有改变
        //第二个也是一样，在堆里开了个空间“value”，然后在常量池开了“java”，但是方法结束，这个栈消失没有改变
        //char，是final，不能改变他的空间指向或者创造新的char，但是可以更改其中的字符
        //当调用方法的时候，指向的还是堆里同一个空间，可以修改char的字符
       ch[0]='h';
    }
}
