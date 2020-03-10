package com.company;

public class Umsortieren {
    public static void main(String[] args) {
        int[] f = new int[] {1, 2, 3, 4};

        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);
        feldUmsortieren(f);
        System.out.println("---------");
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);
    }

    public static void feldUmsortieren(int[] feld){
        int t;
        t = feld[0];
        feld[0] = feld[3];
        feld[3]=t;
        t = feld[1];
        feld[1] =feld[2];
        feld[2] = t;
    }
}
