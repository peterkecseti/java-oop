package com.bmszc.patrik;

public class Kor {

    private int x;
    private int y;
    private int r;

    public Kor(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d,%d)",x,y,r);
    }

    // Terület
    public double terulet(){
        return Math.pow(r, 2) * Math.PI;
    }
    public double kerulet(){
        return 2 * r * Math.PI;
    }

    public void meretValtoztatas(){
        System.out.println("Kör új sugara:");
        r = Feladat2.sc.nextInt();
    }

}
