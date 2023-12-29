package com.wj.homework;

public class LabeledPoint extends Point {
    private String table;

    public LabeledPoint(String table,double x, double y) {
        super(x, y);
        this.table = table;
    }

    @Override
    public String toString() {
        return "Point{" +"table="+table+
                ", x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
}
