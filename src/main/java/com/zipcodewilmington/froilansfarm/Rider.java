package com.zipcodewilmington.froilansfarm;

public abstract class Rider <RiderType extends Person> {
    RiderType rider;
    public Rider () {
        this.rider = null;
    }
    public Rider (RiderType rider) {
        this.rider = rider;

    }
    public void mount (Rideable rideable) {
    }
    public void disMount (Rideable rideable) {
    }
}
