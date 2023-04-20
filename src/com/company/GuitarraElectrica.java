package com.company;

public class GuitarraElectrica implements Guitarra {

    public void encenderGuitarra(){
        System.out.println("Tocar guitarra");
    }

    @Override
    public void apagarGuitarra() {
        System.out.println("Estoy cansado de tocar");
    }
}
