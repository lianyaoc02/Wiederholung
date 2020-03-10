package com.company;

public class Lohnsteuer {
    public static void main(String[] args) {
        double steuersatz = berechneLohnsteuer(100000);
        System.out.println("Muss " + steuersatz + " Lohnsteuer zahlen.");
        System.out.println(berechneLohnsteuer(11001));
    }
    public static double berechneLohnsteuer(double einkommen) {
        double lohnsteuer;
        if (einkommen < 11000){
            lohnsteuer = einkommen * 0;
        } else if (einkommen < 18000) {
            lohnsteuer = (einkommen - 11000) * 0.25;
        } else if (einkommen < 31000) {
            lohnsteuer = (einkommen - 18000) * 0.35 + 1750;
        } else if (einkommen < 60000) {
            lohnsteuer = (einkommen - 31000) * 0.42 + 6300;
        } else if (einkommen < 90000) {
            lohnsteuer = (einkommen - 60000) * 0.48 + 18480;
        } else if (einkommen < 1000000) {
            lohnsteuer = (einkommen - 90000)* 0.50 + 32880;
        } else {
            lohnsteuer = (einkommen - 1000000)* 0.55 + 487880;
        }
        return lohnsteuer;
    }
}
