package com.zipcodewilmington.froilansfarm;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ChickenCoop extends Shelter<Chicken>{

    private final int maxNumberOfChickens = 5;

    public ChickenCoop() {
        Farm.getInstance().addChickenCoop(this);
    }

    @Override
    public Iterator<Chicken> iterator() {
        return creatureList.iterator();
    }

    @Override
    public void forEach(Consumer<? super Chicken> action) {
        super.forEach(action);
    }
}
