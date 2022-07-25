package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public final class Farm {
    private static final Farm FARM = new Farm();

    List<Stable> stableList;
    List<ChickenCoop> chickenCoopList;
    List<Vehicle> vehicleList;

    private Farm() {
        stableList = new ArrayList<>();
        chickenCoopList = new ArrayList<>();
        vehicleList = new ArrayList<>();
    }

    public static Farm getInstance() {
        return FARM;
    }

    public List<Stable> getStableList() {
        return stableList;
    }
    public Integer getTotalHorseCount() {
        Integer total = 0;
        for (Stable stable : getStableList()) {
            total += stable.size();
        }
        return total;
    }
    public void addStable(Stable stable) {
        stableList.add(stable);
    }

    public void addChickenCoop(ChickenCoop coop) {
        chickenCoopList.add(coop);
    }

    public List<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
