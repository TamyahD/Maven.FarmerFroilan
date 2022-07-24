package com.zipcodewilmington.froilansfarm;

public class Tractor<FarmerType extends Farmer> extends Rideable {
    public void Tractor () {

    }

    @Override
    public String makeNoise(){return "Vrooooooom! ChunkaChunkaCoughChunka PuhhtPuuhhht Vrooooooom!";}

    public void harvest(Crop crop) {



    }
}
