package com.company;

public class Schaltjahr {
    public static void main(String[] args) {
        boolean sJahr = istSchaltjahr(2018);
        System.out.println("Ist Schaltjahr: " + sJahr);

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
}
