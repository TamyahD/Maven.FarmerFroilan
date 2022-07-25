package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Shelter<CreatureType> implements Iterable<CreatureType> {
    List<CreatureType> creatureList;

    public void add(CreatureType creatureType) {
        if (creatureList == null) {
            creatureList = new ArrayList<CreatureType>();
        }
        creatureList.add(creatureType);
    }

    public Integer getNumberOfCreature() {
        if (creatureList == null) return 0;
        return creatureList.size();
    }

    public Integer size() {
        if (creatureList == null) return 0;
        return creatureList.size();
    }

//    public void remove(CreatureType creatureType) { // could throw exception
//        if (creatureList != null) creatureList.remove(creatureType);
//    }

//    public void clear() {
//        if (creatureList != null) creatureList.clear();
//    }

    public CreatureType get(int index) {
        return creatureList.get(index);
    }
}

