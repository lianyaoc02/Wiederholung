package com.company;

public class Tierheim {
    public static void main(String[] args) {
        System.out.println("Willkommen im glücklichen Tierheim");
        //Hund Lessie - 20kg - spielfreundig, Löst Kriminalfälle
        double futterLessie;
        double ge = 20;
        futterLessie = berechneFuettereHund(ge);
        System.out.println("Lessie bekommt " + futterLessie + "kg Futter");

        //Unterschiedliche Varianten um das Gewicht um 1 kg zu erhöhen
        double x;
        x = ++ge;
        System.out.println(x + " " + ge);
        // ge = ge +1;
        // ge +=1;
        // ge++;

        //fuettern am Abend
        futterLessie = berechneFuettereHund(ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie + "kg Futter");
    }
    public static double berechneFuettereHund(double gewicht) {
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        // ganz kurz geschrieben
        // return gewicht / 20;
    }
}
