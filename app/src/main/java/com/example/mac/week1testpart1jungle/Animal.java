package com.example.mac.week1testpart1jungle;

public class Animal {

    int energy = 0; // inherited traits
    String kind = "";

    Animal() {
        setEnergy(25); // set inital energy
    }

    public void setEnergy(int change) { //used to add and subtract from energy
        this.energy += change;
    }

    public int getEnergy() {// used to return value of energy
        return this.energy;
    }

    public void setKind(String type) {// used to set species
        kind = type;
    }

    public String getKind() {// used to get species
        return kind;
    }

    public void sound() {// energy value chage for making a sound
        setEnergy(-3);
    }

    public void eat() {// change for eating
        setEnergy(5);
    }

    public void sleep() {// change for sleeping
        setEnergy(10);
    }

    public void play() {// change for playing
        setEnergy(-8);
    }

    public String food(String kind) {// randomly determine the kind of food
        String eats = "";
        if (kind == "Tiger") {// for tigers (tigers don't eat grain)
            switch ((int) (Math.random() * 3)) { // 0 to 2
                case 0:
                    eats = "meat";
                    break;
                case 1:
                    eats = "fish";
                    break;
                case 2:
                    eats = "bugs";
                    break;
            }
        } else {// for others since they are omnivores
            switch ((int) Math.random() * 4) { // 0 to 3
                case 0:
                    eats = "meat";
                    break;
                case 1:
                    eats = "fish";
                    break;
                case 2:
                    eats = "bugs";
                    break;
                case 3:
                    eats = "grain";
                    break;

            }
        }
        return eats;
    }

}

