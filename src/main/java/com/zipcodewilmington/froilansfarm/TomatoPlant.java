package com.zipcodewilmington.froilansfarm;

import Produce.Edible;
import Produce.ProduceStore;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop {

    @Override
    public void yield(Crop crop) {
        Tomato tomato = new Tomato();
            ProduceStore.getInstance().add(tomato);
    }
}
