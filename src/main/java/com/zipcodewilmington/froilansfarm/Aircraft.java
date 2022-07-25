package com.zipcodewilmington.froilansfarm;

public interface Aircraft extends Vehicle<Rideable> {
    default void fly(CropRow<Crop> cropRow) {
    }
}
