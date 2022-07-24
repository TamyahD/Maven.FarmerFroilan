package com.zipcodewilmington.froilansfarm;

import Produce.ProduceStore;

public class CornStalk extends Crop {
    public void yield(Crop crop){
        EarOFCorn corn = new EarOFCorn();
        if (crop.equals(corn)) {
            ProduceStore.getInstance().add(corn);
        }
    }
}
