package com.zipcodewilmington.froilansfarm;

import Produce.Edible;

public final class Froilan extends Farmer{

    private static final Froilan FROILAN = new Froilan("Froilan");

    public static Froilan getFroilan() {
        return FROILAN;
    }

    private Froilan(String name) {
        super(name);
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {
        return "Froilan!";
    }
}
