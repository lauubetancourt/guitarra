package com.company;

public class Main {
    public static void main(String[] args) {
        Guitarra gElectrica = new GuitarraElectrica();
        gElectrica.encenderGuitarra();
        gElectrica.apagarGuitarra();
        System.out.println("");

        Guitarra gAcustica = new AdaptadorGuitarraAcustica();
        gAcustica.encenderGuitarra();
        gAcustica.apagarGuitarra();
    }
}
