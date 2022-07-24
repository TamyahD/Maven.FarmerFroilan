package com.zipcodewilmington.froilansfarm;

public class CropDuster<PilotType extends Pilot> extends Rideable {

    public CropDuster(PilotType pilot){
    };

    public void fertilize(){
    }

    public void fly(){
        makeNoise();
    };


    @Override
    public String makeNoise() {return "rrrrrrrrvvvvvvvvvvVVVVVVVRRRAAAUUUUUUSHSHHSHHHHHshhshhhvvvvvvvvrrrrrrr";}

}
