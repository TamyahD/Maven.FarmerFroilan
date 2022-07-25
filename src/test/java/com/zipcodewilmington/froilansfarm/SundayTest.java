package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.text.Format;

public class SundayTest {
    @Test
    public void sundayTest() {
        //Given
        Field field = new Field();
        CropRow<Crop> cropRow1 = new CropRow<>();
        CropRow<Crop> cropRow2 = new CropRow<>();
        CropRow<Crop> cropRow3 = new CropRow<>();


        //When
        for (int row=1; row<=3; row++) {
            for (int col=1; col<=3; col++) {
                switch (row) {
                    case 1:
                        Froilan.getFroilan().plant(new TomatoPlant(), field.addCropRow(cropRow1));
                        break;
                    case 2:
                        Froilan.getFroilan().plant(new CornStalk(), field.addCropRow(cropRow2));
                        break;
                    case 3:
                        Froilan.getFroilan().plant(new TomatoPlant(), field.addCropRow(cropRow3));
                }
            }
        }

        //Then
//        TomatoPlant tp = new TomatoPlant();
        CropRow<Crop> tp = field.fieldList.get(1);
//        Assert.assertTrue(tp.getClass().equals(TomatoPlant)));
    }
}
