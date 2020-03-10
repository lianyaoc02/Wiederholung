package com.company;

public class Lohnsteuer {
    public static void main(String[] args) {
        double steuersatz = berechneLohnsteuer(17000);
        System.out.println("Muss " + steuersatz + " Lohnsteuer zahlen.");
    }
    public static double berechneLohnsteuer(double einkommen) {
        double lohnsteuer;
        if (einkommen < 11000){
            lohnsteuer = einkommen * 0;
        } else if (einkommen < 18000) {
            lohnsteuer = einkommen * 0.25;
        } else if (einkommen < 31000) {
            lohnsteuer = einkommen * 0.35;
        } else if (einkommen < 60000) {
            lohnsteuer = einkommen * 0.42;
        } else if (einkommen < 90000) {
            lohnsteuer = einkommen * 0.48;
        } else if (einkommen < 1000000) {
            lohnsteuer = einkommen * 0.50;
        } else {
            lohnsteuer = einkommen * 0.55;
        }
        return lohnsteuer;
    }
}
