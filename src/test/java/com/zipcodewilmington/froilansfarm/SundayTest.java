package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

public class SundayTest {
    @Test
    public void sundayTest() {
        Field field = new Field();
        CropRow cropRow1 = new CropRow<>();
        CropRow cropRow2 = new CropRow<>();
        CropRow cropRow3 = new CropRow<>();
//        cropRow1.plantCrop(new TomatoPlant());
//        cropRow2.plantCrop(new TomatoPlant());
//        cropRow1.plantCrop(new TomatoPlant());
        for (int row=1; row<=3; row++) {
            for (int col=1; col<=3; col++) {
                if (row %2 ==0) {
                    Froilan.getFroilan().plant(new TomatoPlant(), field.addCropRow(cropRow1));
                }
                else if(row %2 !=0) {
                    Froilan.getFroilan().plant(new CornStalk(), field.addCropRow(cropRow2));
                }
            }
        }
//        cropRow.plantCrop(new TomatoPlant());
//        cropRow.plantCrop(new CornStalk());
//        cropRow.plantCrop(new TomatoPlant());
//        cropRow.plantCrop(new TomatoPlant());
//
//        for (int row=1; row<=cropRow.getCropList().size(); row++) {
//            Froilan.getFroilan().plant(cropRow.getCropList().get(row), new );
////            if (row==1) {
////            }
//        }
    }
}
