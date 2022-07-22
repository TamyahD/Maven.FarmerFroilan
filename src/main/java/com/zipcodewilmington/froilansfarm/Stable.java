package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;


public class Stable extends Shelter<Horse> {
    private final int maxNumberOfHorses = 4;
    public Stable () {
        Farm.getInstance().addStable(this);
    }

    public int getMaxNumberOfHorses() {
        return maxNumberOfHorses;
    }
}
