package com.zipcodewilmington.froilansfarm;

public interface Rider<RideableType extends Rideable>{
    public void mount(RideableType rideable);
    public void dismount(RideableType rideable);
}
