package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CropRow<C extends Crop> {

    List<C> cropRow = new ArrayList<>();

    public void plantCrop(C crop){
        crop.setHasBeenFertilized(false);
        crop.setHasBeenHarvested(false);
        cropRow.add(crop);
    }

    public void setCropRow(List<C> cropRow) {
        this.cropRow = cropRow;
    }

    public List<C> getCropList() { return cropRow; }


}
