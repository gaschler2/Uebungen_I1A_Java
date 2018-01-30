package com.sabel.uebung.uebung_array;

public class quadrat {
    public static void main(String[] args) {
        int[] quadrat = new quadrat [20];
        druckeArray(quadrat);

    }
    public static void druckeArray(int [] quadrat) {
        for (int i = 0; i < quadrat.length; i++) {
            quadrat[i] = i * i;
        }
    }
    public static void druckeArray(int[] a) {
        for (int i = 0; i < a.lenght - 1; i++){
            System.out.printf("%3d ",a[i]);
        }
    }
    
}
