package com.wj.generic;

/**
 * @author wj
 * @version 1.0
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
interface IUsb<U,R>{
    int n=10;
    //U name="j"; 接口的属性都是静态的，不能使用类定义的泛型
    //インターフェイスのプロパティは静的であり、クラス定義のジェネリックスは使用できない。

    R get(U u); //抽象方法，返回的类型是R   これは抽象メソッドで、戻り値の型は R
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);

    default R method(U u){
        return null;
    }
}
interface IA extends IUsb<String,Double>{

}
class AA implements IA{

    @Override
    public Double get(String string) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }

    @Override
    public Double method(String string) {
        return IA.super.method(string);
    }

}
class BB implements IUsb<Integer,Float>{

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }

    @Override
    public Float method(Integer integer) {
        return IUsb.super.method(integer);
    }
}
class CC implements IUsb{
//不指定就是object，一般不这么写
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }

    @Override
    public Object method(Object o) {
        return IUsb.super.method(o);
    }
}


