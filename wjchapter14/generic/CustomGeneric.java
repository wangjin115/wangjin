package com.wj.generic;

/**
 * @author wj
 * @version 1.0
 */
public class CustomGeneric {
    public static void main(String[] args) {


    }
}
class Tiger<T,R,M>{
    String name;
    T t;
    R r;
    M m;

    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {   //方法使用泛型，返回类型也使用泛型
        // メソッドは、戻り値の型と同様にジェネリックを使う。
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
