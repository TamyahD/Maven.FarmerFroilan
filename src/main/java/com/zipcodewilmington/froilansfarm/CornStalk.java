package com.zipcodewilmington.froilansfarm;

import Produce.ProduceStore;

public class CornStalk extends Crop {
    public void yield(Crop crop){
        EarOFCorn corn = new EarOFCorn();
            ProduceStore.getInstance().add(corn);
    }
}
