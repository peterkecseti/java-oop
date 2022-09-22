package com.bmszc.patrik;

import java.util.Random;

public class Pont {



    private int x;
    private int y;

    public Pont() {
        this.x = 0;
        this.y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(int n){
        Random r = new Random();
        x = r.nextInt(n * -1, n);
        y = r.nextInt(n * -1, n);
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

    @Override
    public String toString() {
        return String.format("[%d;%d]",x,y);
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public String negyed(){
        String value = "";
        // - / -
        if (x < 0 && y < 0){
            value = "Bal alsó";
        }
        // - / +
        else if(x < 0 && y > 0){
            value = "Bal felső";
        }
        // + / +
        else if (x > 0 && y > 0){
            value = "Jobb felső";
        }
        // + / -
        else if (x > 0 && y < 0){
            value = "Jobb alsó";
        }
        return value;
    }
}
