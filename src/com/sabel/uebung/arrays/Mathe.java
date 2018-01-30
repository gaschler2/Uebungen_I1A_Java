package com.sabel.uebung.arrays;

public class Mathe {

    public static double summe(double[] a){
        double summe = 0.0;
        for (int i = 0; i < a.lenght; i++) {
            sume += a[i]; // a an der Stelle i (Werrt an der Stelle i)

        }
        return summe;
    }

    public static void main(String[] args) {
        double[] messwerte = new double[12];
        messwerte[0] = -10.7;

        double[] temperaturen = {-10.7, -11.2, -10.9, -10.4, -10.5};
        double summeAllerTemperaturen = summe(temperaturen);
        System.out.println("Summe aller Temperaturen: " + summeAllerTemperaturen);
        System.out.println("Durchschnittstemperatur: " + summeAllerTemperaturen / temperaturen.length);


    }
}
