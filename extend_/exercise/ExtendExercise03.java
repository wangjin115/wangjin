package com.wj.extend_.exercise;

public class ExtendExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("ipad",16,256,"灰色");
        notePad.printInfo02();

    }
}
class Computer {
private  String cpu;
private int memory;
private int disk;
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public String getDetails(){
     return "cpu="+cpu+"\tmemory="+memory+"\tdisk="+disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
