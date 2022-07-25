package com.zipcodewilmington.froilansfarm;

import Produce.ProduceStore;
import org.junit.Assert;
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

        // add a certain amount of produce in the store
            // eat method removes the edible from the store?

        // make stable
        Stable stabley = new Stable();
        FarmHouse farmHouse = new FarmHouse();
        // put 10 horses in 3 stables
        while (Farm.getInstance().getTotalHorseCount() < 10) {
            Horse myHorse = new Horse();

            for (int i = Farm.getInstance().getStableList().size()-1; i < Farm.getInstance().getStableList().size(); i++) {
                if (Farm.getInstance().getStableList().get(i).size() < Farm.getInstance().getStableList().get(i).getMaxNumberOfHorses()) {
                    Farm.getInstance().getStableList().get(i).add(myHorse);
                    System.out.println(Farm.getInstance().getTotalHorseCount() + " horses");
                    System.out.println("In " + Farm.getInstance().getStableList().size() + " stables");
                    break;
                } else {
                    new Stable().add(myHorse);
                    System.out.println(Farm.getInstance().getTotalHorseCount() + " horses");
                    System.out.println("In " + Farm.getInstance().getStableList().size() + " stables");
                    break;
                }
            }
        }

        // Assert that there are 3 stables
        Integer expected = 10;
        Assert.assertEquals(expected, Farm.getInstance().getTotalHorseCount());
        Assert.assertEquals(3, Farm.getInstance().getStableList().size());

        for (Stable stable : Farm.getInstance().getStableList()) {
            for (int k = 0; k < stable.getNumberOfCreature(); k++) {
                System.out.println("Yeehaw!");
                Froilan.getFroilan().mount(stable.get(k));
                Froilan.getFroilan().dismount(stable.get(k));
                Froilanda.getFroilanda().mount(stable.get(k));
                Froilanda.getFroilanda().dismount(stable.get(k));
                for (int j = 0; j < 3; j++) {
                    stable.get(k).eat(new EarOFCorn());
                }
            }
        }

        System.out.println(Froilan.getFroilan().makeNoise());
        Froilan.getFroilan().eat(new EarOFCorn());
        Froilan.getFroilan().eat(new Tomato());
        Froilan.getFroilan().eat(new Tomato());
        for (int k = 0; k < 5; k++) {
            Froilan.getFroilan().eat(new Egg());
        }
        System.out.println(Froilan.getFroilan().makeNoise());

        Froilanda.getFroilanda().eat(new EarOFCorn());
        Froilanda.getFroilanda().eat(new EarOFCorn());
        Froilanda.getFroilanda().eat(new Tomato());
        Froilanda.getFroilanda().eat(new Egg());
        Froilanda.getFroilanda().eat(new Egg());
        System.out.println(Froilanda.getFroilanda().makeNoise());
    }
}
