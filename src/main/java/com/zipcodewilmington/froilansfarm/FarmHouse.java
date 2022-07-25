package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;

public class FarmHouse extends Shelter<Person> {
    public FarmHouse() {
        Farm.getInstance().setFarmHouse(this);
        this.add(Froilan.getFroilan());
        this.add(Froilanda.getFroilanda());
    }
    @Override
    public Iterator<Person> iterator() {
        return creatureList.iterator();
    }
}
