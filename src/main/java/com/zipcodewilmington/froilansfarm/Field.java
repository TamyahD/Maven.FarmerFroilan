package com.zipcodewilmington.froilansfarm;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Field extends CropRow<Crop> {

    List<CropRow<Crop>> fieldList;

    public Field() {
        fieldList = new ArrayList<>();
    }

    public void setFieldList(List<CropRow<Crop>> fieldList) {
        this.fieldList = fieldList;
    }

    public List<CropRow<Crop>> getFieldList() {
        return fieldList;
    }
}
