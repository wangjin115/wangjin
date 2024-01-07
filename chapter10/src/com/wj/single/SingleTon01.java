package com.wj.single;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }

}
class GirlFriend{
    private String name;

    //这里用static有两个原因，一是因为需要他只能执行一次，
    // 另一个是因为下面的getInstance是静态的方法，只能创建静态的对象
    //如何保障我们只能创建一个GirlFriend对象
    //单例模式：步骤
    //1.将构造器私有化，防止在类的外部直接创建
    //2.在类的内部直接创建对象（该对象是静态的）
    //3.提供一个公共的static方法，返回gf对象

    //类加载的时候就会执行类变量，就算没有调用getInstance，这个类一加载就会创建对象
    private static GirlFriend gf=new GirlFriend("red");
    private GirlFriend(String name) {
        this.name = name;
    }
    //在这里使用static方法是因为在主方法调用的时候没办法创建对象，需要通过类直接调用
    //不能创建对象是因为对象被私有化了

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
