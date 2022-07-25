package com.zipcodewilmington.froilansfarm;

import Produce.Produce;
import Produce.ProduceStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FridayTest {

    //



    List<CropRow<Crop>> hvf = new ArrayList<>();

    @Test
    public void fridayTest_Harvest(){
        CropRow<Crop> cropRow = new CropRow<>();
        CropRow<Crop> cropRow1 = new CropRow<>();
        CropRow<Crop> cropRow2 = new CropRow<>();
        CropRow<Crop> cropRow3 = new CropRow<>();
        CropRow<Crop> cropRow4 = new CropRow<>();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();

        Froilan.getFroilan().plant(cornStalk, cropRow);
        Froilan.getFroilan().plant(tomatoPlant, cropRow1);
        Froilan.getFroilan().plant(tomatoPlant, cropRow2);
        Froilan.getFroilan().plant(cornStalk, cropRow3);
        Froilan.getFroilan().plant(tomatoPlant, cropRow4);
        hvf.add(cropRow);
        hvf.add(cropRow1);
        CropRow<CornStalk> cornStalkCropRow = new CropRow<>();
        cornStalkCropRow.plantCrop(cornStalk);





        CropDuster<Froilanda> cd = new CropDuster<>(Froilanda.getFroilanda());
        Field field = new Field();

        Froilanda.getFroilanda().mount(cd);
        field.setFieldList(hvf);
        hvf = field.getFieldList();
        for (int i = 0; i < hvf.size(); i++) {
            cd.fly(hvf.get(i));
        }


        Tractor<Froilan> frolianTractor = new Tractor<>(Froilan.getFroilan());
        Froilan.getFroilan().mount(frolianTractor);

        for (CropRow<Crop> crop : hvf) {
            frolianTractor.operate(crop);
        }
        Froilan.getFroilan().dismount(frolianTractor);

    }


    @Test
    public void fridayTest_ProduceStore(){
        Tomato tomato = new Tomato();

        ProduceStore.getInstance().add(tomato);
        ProduceStore.getInstance().getQuantityInStorage(tomato);
        ProduceStore.getInstance().contains(tomato);
        ProduceStore.getInstance().remove(tomato);
    }

    @Test
    public void fridayTest_Produce(){

    }


}