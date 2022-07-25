package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;

public class FarmHouse extends Shelter<Person> {
    public FarmHouse() {
        Farm.getInstance().setFarmHouse(this);
    }
    @Override
    public Iterator<Person> iterator() {
        return creatureList.iterator();
    }
}
