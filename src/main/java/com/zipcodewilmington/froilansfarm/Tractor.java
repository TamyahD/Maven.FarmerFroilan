package com.zipcodewilmington.froilansfarm;

import Produce.Edible;
import Produce.ProduceStore;

import java.util.List;

public class Tractor<FarmerType extends Farmer> extends Rideable {

    FarmerType farmer;
    public Tractor(FarmerType farmer) {
        this.farmer = farmer;
    }

    @Override
    public String makeNoise(){return "Vrooooooom! ChunkaChunkaCoughChunka PuhhtPuuhhht Vrooooooom!";}

    public void harvest(CropRow<Crop> cropRow) {
        List<Crop> cropList = cropRow.getCropList();
        for (Crop crop : cropList) {
            if (crop.getHasBeenFertilized()) {
                crop.setHasBeenHarvested(true);
                cropList.remove(crop);
                crop.yield(crop);
                }
        }
    }

    public void operate(CropRow<Crop> cropRow){
        makeNoise();
        harvest(cropRow);
    }
}
