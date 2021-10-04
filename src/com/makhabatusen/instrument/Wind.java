package com.makhabatusen.instrument;

public class Wind implements Instrument {
    @Override
    public void play() {
        System.out.println("Played by blowing the air");
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjust metal keys");
    }
}
