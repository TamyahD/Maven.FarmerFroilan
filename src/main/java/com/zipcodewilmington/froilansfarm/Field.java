package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field extends CropRow<Crop> {

    List<CropRow<Crop>> fieldList;

    public Field() {
        fieldList = new ArrayList<>();
    }

    public void setFieldList(List<CropRow<Crop>> fieldList) {
        this.fieldList = fieldList;
    }

    public CropRow<Crop> addCropRow(CropRow<Crop> cropRow) {
        fieldList.add(cropRow);
        return cropRow;
    }

    public List<CropRow<Crop>> getFieldList() {
        return fieldList;
    }
}
