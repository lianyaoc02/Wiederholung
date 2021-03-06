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

        //-teste wieweitspazieren
        System.out.println(wieWeitSparzieren(12, 25, true));
        double weit;
        double gewicht = 4;
        int letztesMalDauer = 20;
        boolean vertraegtSich = true;
        weit = wieWeitSparzieren(gewicht, letztesMalDauer, vertraegtSich);
        System.out.println("Der Hund wird " + weit + "km spazieren sollen.");

        //Testen Kuschelzeit
        int[] kZeit = new int[]{10, 26, 30};
        System.out.println(kuschelBedarf(kZeit));
        boolean kB = kuschelBedarf (kZeit);
        if (kB) {
            System.out.println("Der Hund braucht kuscheln.");
        } else {
            System.out.println("Der Hund braucht nicht kuscheln.");
        }
    }



    public static double berechneFuettereHund(double gewicht) {
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        // ganz kurz geschrieben
        // return gewicht / 20;
    }

    public static double wieWeitSparzieren(double gewicht, int letztesMal, boolean vertraegtSich) {
        double weitSpazieren;
        if ( gewicht < 1 && !vertraegtSich) {
            weitSpazieren = 2.0;
        } else if (gewicht <1 && vertraegtSich) { //else if (gewicht < 1)
            weitSpazieren = 4.0;
        //alternative
            /*if (gewicht <1){
                if (vertraegtSich){
                    return 4.0;
                }else{
                    return 2.0;
                }
            }*/
        } else if (gewicht > 15 || letztesMal > 24 && vertraegtSich) {
            weitSpazieren = 8.0;
        } else {
            weitSpazieren = 5.0;
        }
        return weitSpazieren;
    }

    public static boolean kuschelBedarf (int[] kuschelZeit){
        boolean kBedarf;
        if (kuschelZeit[0] + kuschelZeit[1] + kuschelZeit[2] > 60 || kuschelZeit[1] > 25) {
            kBedarf = false;
        } else if (kuschelZeit[0] < kuschelZeit[1] && kuschelZeit[1] < kuschelZeit[2]) {
            kBedarf = true;
        /*} else if (kuschelZeit[2] > 25) {
            kBedarf = false;*/
        } else {
            kBedarf = true;
        }
        return kBedarf;
    }
}
