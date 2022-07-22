package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {
    Chicken chicken = new Chicken();
    Horse horse = new Horse();

    @Test
    public void testNoise() {
        //Given
        //When
        //Then
        String actual = chicken.makeNoise();
        String expected = "look at all those chickens...";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testNoiseNotNull() {
        Assert.assertNotNull(chicken.makeNoise());
    }
}