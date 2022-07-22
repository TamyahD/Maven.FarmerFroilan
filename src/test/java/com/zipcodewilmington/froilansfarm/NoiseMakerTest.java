package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {
    Chicken chicken = new Chicken();
    Horse horse = new Horse();

    @Test
    public void testChickenNoise() {
        //Given
        //When
        //Then
        String actual = chicken.makeNoise();
        String expected = "look at all those chickens...";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testChickenNoiseNotNull() {
        Assert.assertNotNull(chicken.makeNoise());
    }

    @Test
    public void testHorseNoise() {
        //Given
        //When
        //Then
        String actual = horse.makeNoise();
        String expected = "neigh nEigh";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHorseNoiseNotNull() {
        Assert.assertNotNull(horse.makeNoise());
    }
}