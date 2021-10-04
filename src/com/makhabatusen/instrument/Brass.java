package com.makhabatusen.instrument;

public class Brass extends Wind {
    @Override
    public void play() {
        System.out.println("Produces sound by sympathetic vibration");
    }

    @Override
    public void adjust() {
        System.out.println("Adjust slides");
    }
}
