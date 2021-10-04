package com.makhabatusen.instrument;

public class Percussion implements  Instrument{
    @Override
    public void play() {
        System.out.println("Sounded by being struck by a beater");
    }

    @Override
    public String what() {
        return "Drum";
    }

    @Override
    public void adjust() {
        System.out.println("Adjust pitching");
    }
}
