package Produce;

public abstract class Produce<Edible>{

    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    public abstract Edible yield();
}
