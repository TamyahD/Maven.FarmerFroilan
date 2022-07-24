package com.zipcodewilmington.froilansfarm;

import Produce.Edible;
import Produce.ProduceStore;

public class Tractor<FarmerType extends Farmer> extends Rideable {
    public Tractor() {
    }

    @Override
    public String makeNoise(){return "Vrooooooom! ChunkaChunkaCoughChunka PuhhtPuuhhht Vrooooooom!";}

    public void harvest(Crop crop) {
        //need to figure out how croprows work


//        Crop CornStalk = new CornStalk();
//        Crop TomatoPlant = new TomatoPlant();
//        CropRow cr = new CropRow();
//        int numberOfCrops = cr.harvestCrop(crop);
//        if (crop.equals(TomatoPlant) && crop.getHasBeenFertilized()) {
//            Edible Tomato = new Tomato();
//            ProduceStore.getInstance().add(Tomato, numberOfCrops);
//        } else if (crop.equals(CornStalk) && crop.getHasBeenFertilized()) {
//            Edible EarOFCorn = new EarOFCorn();
//            ProduceStore.getInstance().add(EarOFCorn, numberOfCrops);
//        }
    }
}
