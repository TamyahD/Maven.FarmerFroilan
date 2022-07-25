package com.zipcodewilmington.froilansfarm;

import Produce.Edible;

public final class Froilan extends Farmer implements Rider{

    private static final Froilan FROILAN = new Froilan("Froilan");
    private Froilan(String name) {
        super(name);
        Farm.getInstance().getFarmHouse().add(this);
    }
    public static Froilan getFroilan() {
        return FROILAN;
    }


    @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {
        return "Froilan!";
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }
}
