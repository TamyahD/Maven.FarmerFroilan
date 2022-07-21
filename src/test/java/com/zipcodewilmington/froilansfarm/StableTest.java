package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    @Test
    public void stableConstructorTest(){
        Stable stable = new Stable();
        Horse horsie = new Horse();
        stable.add(horsie);
        Integer expected = 1;

        Integer actual = stable.getNumberOfCreature();

        Assert.assertEquals(expected, actual);
    }

}
