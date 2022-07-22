package com.zipcodewilmington.froilansfarm;

import Produce.Edible;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop{
    public Tomato yield() {
        if (getHasBeenFertilized()) {
            setHasBeenHarvested(true);
            return new Tomato();
        } else { return null; }
    }
}
