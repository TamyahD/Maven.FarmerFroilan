package com.zipcodewilmington.froilansfarm;

import java.util.List;

public final class Farm {
    private static final Farm FARM = new Farm();

    List<Stable> stableList;
    List<ChickenCoop> chickenCoopList;
    List<Vehicle> vehicleList;

    private Farm() {
    }

    public static Farm getInstance() {
        return FARM;
    }

    public List<Stable> getStableList() {
        return stableList;
    }

    public List<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
