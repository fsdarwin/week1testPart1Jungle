package com.example.mac.week1testpart1jungle;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static void main(String[] args) {
        // Initialize an ArrayList for the animals
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger()); // Start with 3 animals
        animals.add(new Snake()); // by calling their constuctors
        animals.add(new Monkey()); // and putting them into the array list
        String baby = "";

        while (animals.size() < 50) {// while there are less than 50 animals in the jungle
            int action = (int) (Math.random() * 5);// call a random number between 0 and 4
            switch (action) {// depending on the roll
                case 0: // a birth might occure
                    int birth = (int) (Math.random() * 3); // random between 0 and 2
                    switch (birth) {
                        case 0:
                            animals.add(new Tiger());
                            baby = "Tiger";
                            break;
                        case 1:
                            animals.add(new Snake());
                            baby = "Snake";
                            break;
                        case 2:
                            animals.add(new Monkey());
                            baby = "Monkey";
                            break;
                    }
                    System.out.println("A baby " + baby + " was born");
                    System.out.println();
                    break;
                case 1:// The Tigers might do something
                    for (int i = 0; i < animals.size(); i++) { // cycle through the array
                        if (animals.get(i).getKind() == "Tiger") { // when you find a type Tiger...
                            int itDoes = (int) (Math.random() * 3);// 0 to 2
                            switch (itDoes) {
                                case 0: // it might roar if it has enough energy
                                    if (animals.get(i).getEnergy() > 5) {
                                        System.out.println("Roar");
                                        animals.get(i).sound(); // subtract 3 from energy for roaring
                                    } else { // if not...
                                        System.out.println("Tiger tired");
                                    }
                                    break;
                                case 1: // it might eat
                                    System.out.println("Tiger eats " + animals.get(i).food("Tiger"));
                                    animals.get(i).eat(); // add 5 to energy for eating
                                    break;
                                case 2: // it might sleep
                                    System.out.println("Tiger Sleeps");
                                    animals.get(i).sleep(); // add 5 to energy for sleeping
                                    break;
                            }
                            System.out.println("Tiger energy: " + animals.get(i).getEnergy());
                            System.out.println();
                        }
                    }
                    break;
                case 2: // the snakes might do something
                    for (int i = 0; i < animals.size(); i++) {
                        if (animals.get(i).getKind() == "Snake") {
                            int itDoes = (int) (Math.random() * 3); // 0 to 2
                            switch (itDoes) {
                                case 0: // it might Ssss
                                    if (animals.get(i).getEnergy() > 5) {//if it has enough energy
                                        System.out.println("Ssss");
                                        animals.get(i).sound();// subtact 3 from energy
                                    } else {// if not...
                                        System.out.println("Snake tired");
                                    }
                                    break;
                                case 1:// it might eat
                                    System.out.println("Snake eats " + animals.get(i).food("Snake"));
                                    animals.get(i).eat();// add 5 ffor eating
                                    break;
                                case 2: // it might sleep
                                    System.out.println("Snake Sleeps");
                                    animals.get(i).sleep();// add 10 for sleeping
                                    break;
                            }
                            System.out.println("Snake energy: " + animals.get(i).getEnergy());
                            System.out.println();
                        }
                    }
                    break;
                case 3:// the monkeys might do something
                    for (int i = 0; i < animals.size(); i++) {
                        if (animals.get(i).getKind() == "Monkey") {
                            int itDoes = (int) (Math.random() * 4);// 0 to 3
                            switch (itDoes) {
                                case 0: // it migh Arrk if it has enouh energy
                                    if (animals.get(i).getEnergy() > 5) {
                                        System.out.println("Arrk");
                                        animals.get(i).sound();// subtract 4
                                    } else {// if not...
                                        System.out.println("Monkey tired");
                                    }
                                    break;
                                case 1:// it might eat
                                    System.out.println("Monkey eats " + animals.get(i).food("Monkey"));
                                    animals.get(i).eat();// add 2 for eating
                                    break;
                                case 2:// it might sleep
                                    System.out.println("Monkey Sleeps");
                                    animals.get(i).sleep();// add 10 for sleeping
                                    break;
                                case 3:// it might play
                                    if (animals.get(i).getEnergy() < 9) {// if it has enough energy
                                        System.out.println("Monkey too tired");
                                    } else {// if it does...
                                        System.out.println("Monkey Plays");
                                        System.out.println("Oooo oooo oooo");
                                        animals.get(i).play();// subtract 8 for playing
                                    }
                                    break;
                            }
                            System.out.println("Monkey energy: " + animals.get(i).getEnergy());
                            System.out.println();
                        }
                    }
                    break;
                case 4:// the jungle might sound off
                    System.out.println("Sound off!");
                    for (int i = 0; i < animals.size(); i++) {// cycle through the array
                        switch (animals.get(i).getKind()) {
                            case "Tiger":// if it's a tiger
                                if (animals.get(i).getEnergy() > 5) {// and it has enough energy
                                    System.out.println("Tiger: Roar");
                                    animals.get(i).sound();// subtract 3
                                    break;
                                } else { // otherwise...
                                    System.out.println("Tiger tired");
                                }
                                break;
                            case "Snake":// same for a snake
                                if (animals.get(i).getEnergy() > 5) {
                                    System.out.println("Snake: Ssss");
                                    animals.get(i).sound();
                                    break;
                                } else {
                                    System.out.println("Snake tired");
                                }
                                break;
                            case "Monkey":// same for a monkey
                                if (animals.get(i).getEnergy() > 5) {
                                    System.out.println("Monkey: Arrk");
                                    animals.get(i).sound();
                                    break;
                                } else {
                                    System.out.println("Monkey tired");
                                }
                                break;
                        }
                        System.out.println("Energy: " + animals.get(i).getEnergy());
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
