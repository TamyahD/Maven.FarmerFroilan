package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class MondayTest {

    @Test
    public void rideAndFeedHorsesStable1() {

        Stable stable1 = new Stable();

        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());

        for (Horse h : stable1) {
            Froilan.getFroilan().mount(h);
            System.out.println("YEEHAW!");
            Froilan.getFroilan().dismount(h);
        }

        Assert.assertTrue(stable1.get(0) instanceof Rideable);
    }

    @Test
    public void rideHorsesStableTwo() {

        Stable stable2 = new Stable();

        for (int i = 0; i < 3; i++) {
            stable2.add(new Horse());
        }

        for (Horse h : stable2) {
            Froilan.getFroilan().mount(h);
            System.out.println("FROILAN!");
            Froilan.getFroilan().dismount(h);
        }
    }

    @Test
    public void rideHorsesStableThree() {

        Stable stable3 = new Stable();

        for (int i = 0; i < 4; i++) {
            stable3.add(new Horse());
        }

        for (Horse h : stable3) {
            Froilan.getFroilan().mount(h);
            System.out.println("WUBALUBBADUBDUB!");
            Froilan.getFroilan().dismount(h);
        }
    }

    @Test
    public void chickenCheck() {
        ChickenCoop coop1 = new ChickenCoop();

        coop1.add(new Chicken());
        coop1.add(new Chicken());

        for (Chicken c : coop1) {
            c.makeNoise();
            c.eat(new EarOFCorn());
        }

        Assert.assertTrue(coop1.size() <= coop1.getMaxNumberOfChickens());
        Assert.assertTrue(coop1 instanceof ChickenCoop);
    }

}
