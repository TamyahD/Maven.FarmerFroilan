package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Test;

public class NoiseMakerTest extends TestCase {
    Chicken chicken = new Chicken();
    Horse horse = new Horse();

    @Test
    public void testNoise() {
        //Given
        //When
        //Then
        String actual = chicken.makeNoise();
        String expected = "cluck cluck cluck";
        assertEquals(expected, actual);
    }
    @Test
    public void testNoiseType() {
        assertTrue(chicken.makeNoise() instanceof String);
    }
}