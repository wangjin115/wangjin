package com.wj.codeblock;

public class block_ {
    public static void main(String[] args) {

        //(1) 进行类的加载   クラス・ロードの実行
       //1.1 先加载 父类 A02 1.2 再加载 B02  1.1 親クラスA02のロード 1.2 B02のロード
        // (2) 创建对象   オブジェクトの作成
        //2.1 从子类的构造器开始  子クラスのコンストラクタから開始する。
        new B02();//对象  オブジェクト
        //new C02();
        System.out.println("========");
        new B02();
    }
}
class C02 {
    private int n1 = 100;
    private static int n2 = 200;
    private void m1() {
    }
    private static void m2() {
    }
    static { //静态代码块，只能调用静态成员，非静态的调用就错误 スタティックブロックはスタティックメンバーのみ呼び出せ、非静的呼び出しはエラーだ
        //System.out.println(n1);//错误 ばつ
        System.out.println(n2);//ok
        // m1();//错误　　ばつ
        m2();   //ok
    }
    {   //普通代码块，可以使用任意成员　　　通常のコードブロック、任意のメンバを使用できる
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2(); }
}
class A02 { //父类  親クラス
    private static int n1 = getVal01();
    static {
        System.out.println("A02 的一个静态代码块..");//(2)
        }
        {
            System.out.println("A02 的第一个普通代码块..");//(5)
        }
        public int n3 = getVal02();//普通属性的初始化   共通属性の初期化
       public static int getVal01() {
        System.out.println("getVal01");//(1)
        return 10; }
    public int getVal02() {
           System.out.println("getVal02");//(6)
         return 10;
    }
    public A02() {//构造器  コンストラクタ
           // 隐藏super()  super()を隠す
        // 普通代码块和普通属性的初始化......  共通コードブロックと共通属性の初期化
        System.out.println("A02 的构造器");//(7)
    }
    }

class B02 extends A02 { //
    private static int n3 = getVal03();
    static {
        System.out.println("B02 的一个静态代码块..");//(4)
    }
    public int n5 = getVal04();
    {
        System.out.println("B02 的第一个普通代码块..");//(9)

    }
    public static int getVal03() {
        System.out.println("getVal03");//(3)
         return 10;
    }
    public int getVal04()
    { System.out.println("getVal04");//(8)
         return 10;
    } //一定要慢慢的去品..
     public B02() {//构造器
      //隐藏了
      //super()
         // 普通代码块和普通属性的初始化...
    System.out.println("B02 的构造器");//(10)

    }
}

