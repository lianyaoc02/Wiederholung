package com.company;

public class Schaltjahr {
    public static void main(String[] args) {
        boolean sJahr = istSchaltjahr(2018);
        System.out.println("Ist Schaltjahr: " + sJahr);
        System.out.println(istSchaltjahr1(2000));
        System.out.println(istSchaltjahr1(1900));
        System.out.println(istSchaltjahr1(2020));
        System.out.println(istSchaltjahr1(1997));
    }
    public static boolean istSchaltjahr(int jahr) {
        boolean schaltjahr;
        if (jahr % 4 == 0 && jahr % 100 == 0 && jahr % 400 == 0) {
            schaltjahr = true;
        } else if (jahr % 4 == 0 && jahr % 100 ==0) {
            schaltjahr =false;
        } else if (jahr % 4 == 0) {
            schaltjahr = true;
        } else {
            schaltjahr =false;
        }
        return schaltjahr;
    }


    public static boolean istSchaltjahr1(int jahr){
        if ((jahr % 400) == 0) {
            return true;
        }
        if ((jahr % 100) == 0) {
            return false;
        }
        if ((jahr % 4) ==0) {
            return true;
        }
        return false;
    }
}