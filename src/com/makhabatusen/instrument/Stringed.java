package com.makhabatusen.instrument;

public class Stringed implements Instrument {
    @Override
    public void play() {
        System.out.println("Produces sound from vibrating strings");
    }

    @Override
    public String what() {
        return "Guitar";
    }

    @Override
    public void adjust() {
        System.out.println("Tune the string");
    }
}
