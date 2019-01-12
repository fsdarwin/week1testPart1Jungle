package com.example.mac.week1testpart1jungle;

public class Monkey extends Animal {
    Monkey() {
        kind = "Monkey";// set species
    }

    public void sound() {// override as monkeys use more energy for sounding
        setEnergy(-4);
    }

    public void eat() {// override as monkeys get less energy from food
        setEnergy(2);
    }

}
