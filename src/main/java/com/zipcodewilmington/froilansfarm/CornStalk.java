package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop {
    public EarOFCorn yield(){
        if (getHasBeenFertilized()) {
            setHasBeenHarvested(true);
            return new EarOFCorn();
        } else { return null; }
    }
}
