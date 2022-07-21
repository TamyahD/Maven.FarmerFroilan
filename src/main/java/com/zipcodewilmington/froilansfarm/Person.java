package com.zipcodewilmington.froilansfarm;

public abstract class Person implements Eater, NoiseMaker{
    String name;
    public Person (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

}
