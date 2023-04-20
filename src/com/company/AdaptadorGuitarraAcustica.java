package com.company;

public class AdaptadorGuitarraAcustica implements Guitarra {

    private GuitarraAcustica gAcustica = new GuitarraAcustica();

    @Override
    public void encenderGuitarra() {
        gAcustica.tocar();
    }

    @Override
    public void apagarGuitarra() {
        gAcustica.dejarGuitarra();
    }
}
