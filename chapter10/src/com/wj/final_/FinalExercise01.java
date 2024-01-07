package com.wj.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("面积为"+circle.Area());
    }

}

class Circle{
    private double radius;
    private final double pai=3.14;
    public final double pai2;
    {
        pai2=3.14;
    }
    public final double pai3;
    public Circle(double radius) {
        this.radius = radius;
        pai3=3.14;
    }

    public double Area(){
        return pai*radius*radius;
    }
}

