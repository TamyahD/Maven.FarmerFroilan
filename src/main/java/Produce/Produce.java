package Produce;

import com.zipcodewilmington.froilansfarm.Crop;

public abstract class Produce<EdibleType extends Edible>{

    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    public abstract void yield(Crop crop);

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
