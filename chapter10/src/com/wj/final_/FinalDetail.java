package com.wj.final_;

public class FinalDetail {
    public static void main(String[] args) {
        System.out.println(BBB.num);

    }
}
class BBB{
    public static int num=getVal01();
   // public static int num=10000;
    //这地方要注意，如果我这写的是一个数字，main方法调用的时候是先输出下面静态代码块里的语句，再输出数字
    //もし私が数字を書いていたら、数字を出力する前に以下の静的コード・ブロックを出力してメイン・メソッドが呼び出されただろうことに注意してほしい。
    // 是因为打印是在main方法执行的，也就是说虽然两个静态优先级一样，按顺序输出，
    // 但是因为静态属性里没有输出语句，虽然先执行了，但是后输出
    //これは、印刷がメイン・メソッドの中で実行されるためで、2つの静的優先順位は同じで順番に出力されるが、静的属性には出力文がないため、先に実行されるにもかかわらず、後から出力されることになる。

   // public static final int num=10000;
    //当这个加上final的时候，类不会加载，直接调用了这个语句，不会输出下面静态代码块的语句，效率高

    //但是如果在代码块中赋值就会执行静态代码块
    static {
      //  num=1000;
        System.out.println("BBB 静态代码块被执行");
    }
    //用这个例子也能看出来，最后输出了10
    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }

}
