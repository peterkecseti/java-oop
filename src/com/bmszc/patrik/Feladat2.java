package com.bmszc.patrik;

import java.util.Scanner;

public class Feladat2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Kor k1 = new Kor(0, 0, 1);
        Kor k2 = new Kor(0, 0, 2);
        Kor k3 = new Kor(0, 0, 3);
        Kor k4 = new Kor(0, 0, 4);
        Kor k5 = new Kor(0, 0, 5);
        Kor k6 = new Kor(0, 0, 6);
        Kor k7 = new Kor(0, 0, 7);
        Kor k8 = new Kor(0, 0, 8);
        Kor k9 = new Kor(0, 0, 9);
        Kor k10 = new Kor(0, 0, 10);


        String temp = "";

        System.out.print("X koordináta (nem kötelező): ");
        temp = sc.nextLine();
        if (temp.equals("")){
            k1.setX(0);
        }else {
            k1.setX(Integer.parseInt(temp));
        }
        System.out.print("Y koordináta (nem kötelező): ");
        temp = sc.nextLine();
        if (temp.equals("")){
            k1.setY(0);
        }else {
            k1.setY(Integer.parseInt(temp));
        }
        System.out.printf("kör sugara: ");
        k1.setR(sc.nextInt());

        System.out.printf("A kör területe: %.2f u^2.", k1.terulet());
        System.out.printf("\nA kör kerülete: %.2f u.\n", k1.kerulet());
        k1.meretValtoztatas();
        //System.out.printf("%d, %d, %d", k1.getX(), k1.getY(), k1.getR());
        System.out.println(k1);

        //

        System.out.println("" + k1 + k2 + k3 + k4 + k5 + k6 + k7 + k8 + k9 + k10);

        Kor[] sugarak = new Kor[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};
            int max = 0;



        for (int i = 0; i < sugarak.length; i++) {

            if (max < sugarak[i].getR()){
                max = sugarak[i].getR();
            }
        }
        System.out.println("A legnagyobb területű kör területe " + max + "u^2");

    }
}
