package com.wj.tankgame4;

/**
 * @author wj
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;
    private int direct;
    private int speed=5;
    public void moveUp(){
        y-= speed;
       // y = Math.max(0, y - speed);
    }
    public void moveRight(){
     //  x = Math.min(1000 - 60, x + speed);
        x += speed;
    }

    public void moveDown(){
       // y = Math.min(750 - 90, y + speed);
        y+= speed;
    }
    public void moveLeft(){
      //  x = Math.max(0, x - speed);
        x -= speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;

    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

