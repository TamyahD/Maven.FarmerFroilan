package com.zipcodewilmington.froilansfarm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Field extends CropRow<Crop> {

    CropRow<Crop> cropRow;

    Map<Integer, List<Crop>> fieldMap;

    public Field() {
        fieldMap = new HashMap<>();
    }


    public CropRow<Crop> getCropRow() {
        return cropRow;
    }



}
