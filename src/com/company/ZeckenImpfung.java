package com.company;

public class ZeckenImpfung {
    public static void main(String[] args) {
        int nImpufungsjahr = naechsteZeckenImpfung(45, 2005, true);
        System.out.println("Man soll in " + nImpufungsjahr + " die nächste Zecken Auffrischungsimpfung durchführen.");
    }

    public static int naechsteZeckenImpfung(int alter, int letztesImpfungsjahr, boolean ersteAuffrischung) {
        int naechstesImpfungsjahr;
        if (alter > 60 || ersteAuffrischung) {
            naechstesImpfungsjahr = letztesImpfungsjahr + 3;
        } else {
            naechstesImpfungsjahr = letztesImpfungsjahr + 5;
        }
        return naechstesImpfungsjahr;
    }
}
