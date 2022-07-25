package com.zipcodewilmington.froilansfarm;

import Produce.Edible;

public class Horse implements Animal, Rideable {
    public Horse() {

    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {
        return "neigh nEigh";
    }
}
