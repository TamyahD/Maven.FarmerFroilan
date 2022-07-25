package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class CropDuster<PilotType extends Pilot> implements Aircraft {

    Pilot pilot;

    public CropDuster(PilotType pilot){
        this.pilot = pilot;
    }

    public void fertilize(CropRow<Crop> croprow){
        List<Crop> cropList = croprow.getCropList();
        for (Crop crop : cropList) {
            crop.setHasBeenFertilized(true);
        }
        croprow.setCropRow(cropList);
    }

    public void fly(CropRow<Crop> cropRow){
        makeNoise();
        fertilize(cropRow);
    }


    @Override
    public String makeNoise() {return "rrrrrrrrvvvvvvvvvvVVVVVVVRRRAAAUUUUUUSHSHHSHHHHHshhshhhvvvvvvvvrrrrrrr";}

}
