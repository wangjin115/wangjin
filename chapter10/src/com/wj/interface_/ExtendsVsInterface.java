package com.wj.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();

    }
}
class Monkey{
    private String name;
    public Monkey() {
    }
    public Monkey(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println(name+"会爬树");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}
//子类继承了父类，就自动拥有了父类的功能
//如果子类需要扩展功能，可以通过实现接口的方式扩展
//实现接口是对java单继承机制的一种补充
//サブクラスが親クラスを継承する場合、そのサブクラスは自動的に親クラスの機能を持つ。
//サブクラスが機能を拡張する必要がある場合は、インターフェースを実装することで拡張できる。
//インターフェイスの実装は、javaの単一継承メカニズムを補完するものです。
class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey() {
    }
    public LittleMonkey(String name) {
        super(name);
    }
    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习会游泳");

    }
    @Override
    public void flying() {
        System.out.println(getName()+"通过学习会飞");
    }
}

