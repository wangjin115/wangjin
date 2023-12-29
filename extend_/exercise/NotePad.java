package com.wj.extend_.exercise;

public class NotePad extends Computer{
   private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }
    public void printInfo02(){
        System.out.println(getDetails() + "\tcolor=" + color);
    }
}
