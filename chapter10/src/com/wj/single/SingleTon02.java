package com.wj.single;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
        System.out.println(instance==instance1);
    }

}
//在程序运行过程中，只创建一个cat对象
class Cat{
    private String name;
    private static Cat cat;//不创建对象，默认是null
    //步骤
    //1.仍然构造器私有化
    //2.定义一个static静态属性对象
    //3.提供一个public的static方法，返回一个cat对象
    //4.只有当用户使用getInstance方法的时候才返回cat对象，再次调用这个方法的时候，会返回上次创建的cat对象
    //从而保证了单例
    private Cat(String name) {
        this.name = name;
    }
    //要调用getInstance方法的时候才执行，创建一个cat对象
    public static Cat getInstance(){
        if(cat==null){
            cat =new Cat("cute");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
