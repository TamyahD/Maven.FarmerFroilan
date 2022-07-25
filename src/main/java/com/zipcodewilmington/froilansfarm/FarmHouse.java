package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;

public class FarmHouse extends Shelter<Person> {
    Shelter<Person> personList;
    public Shelter<Person> getPersonList() {
        return personList;
    }
    public void setPersonList(Shelter<Person> personList) {
        this.personList = personList;
    }
    @Override
    public Iterator<Person> iterator() {
        return creatureList.iterator();
    }
}
