package com.example.mac.week1testpart1jungle;

public class Tiger extends Animal {
    Tiger() {
        kind = "Tiger"; // set species
    }

    @Override
    public void sleep() {// override parent method
        setEnergy(5); // tigers get less from sleep
    }
}
