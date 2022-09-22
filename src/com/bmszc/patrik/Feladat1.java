package com.bmszc.patrik;

public class Feladat1 {
    public static void main(String[] args) {

        Pont p1 = new Pont(3,6);
        System.out.printf("Az origo és a pont távolsága %.2f", p1.distance());
        System.out.println("\n" + p1.negyed());

    }
}
