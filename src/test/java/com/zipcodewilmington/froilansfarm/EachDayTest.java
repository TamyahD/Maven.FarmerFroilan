package com.zipcodewilmington.froilansfarm;

import Produce.ProduceStore;
import org.junit.Test;

public class EachDayTest {
    @Test
    public void eachDayTest() {
        /*
        Every morning, Froilan and Froilanda begin their morning by
            Riding each Horse in each Stable.
            Feeding each Horse 3 ear of Corn.
            For breakfast,
            Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
            Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
         */
        //Froilan and Froilanda will be eager initialized
        for (Stable stable : Farm.getInstance().getStableList()) {
            for (int i = 0; i < stable.getNumberOfCreature(); i++) {
                Froilan.getFroilan().mount(stable.get(i));
                Froilan.getFroilan().dismount(stable.get(i));
                Froilanda.getFroilanda().mount(stable.get(i));
                Froilanda.getFroilanda().dismount(stable.get(i));
            }
        }
//        ProduceStore.getInstance().add(corn, 7);
    }
}
