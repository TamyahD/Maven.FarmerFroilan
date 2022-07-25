package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class Stable extends Shelter<Horse> {
    private final int maxNumberOfHorses = 4;

    public Stable() {
        Farm.getInstance().addStable(this);
    }

    public int getMaxNumberOfHorses() {
        return maxNumberOfHorses;
    }


    @Override
    public Iterator<Horse> iterator() {
        return creatureList.iterator();
    }

    @Override
    public void forEach(Consumer<? super Horse> action) {
        super.forEach(action);
    }
}
