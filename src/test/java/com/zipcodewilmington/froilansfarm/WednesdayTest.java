package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class WednesdayTest {

    @Test
    public void wednesdayTest() {
        // test farmhouse
        FarmHouse farmHouse = new FarmHouse();
        Integer expected = 2;

        Integer actual = Farm.getInstance().getFarmHouse().size();

        Assert.assertEquals(expected, actual);
    }
}
