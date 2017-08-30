package com.zoo.animals;

/**
 * Created by mzdzioch on 2017-08-26.
 */
public class Animal {
    private String color;
    private int legCount;
    private int weight;
    private String name;
    private Integer hungerLevel;

    public Animal() {
        hungerLevel = 50;
        System.out.println("Hello from Animal() constructor");
    }

    public Animal(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
        System.out.println("Hello from Animal(hungerLevel) constructor");
    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        if (hungerLevel < 100) {
            hungerLevel += 10;
            System.out.println("I'm animal - I'm moving");
        } else
            System.out.println("I'm exausted and starving!!! Can't move!");
    }

    public void makeSound() {
        if (hungerLevel < 100) {
            hungerLevel += 10;
            System.out.println("I'm making some noise");
        } else
            System.out.println("I'm exausted and starving!!! Can't make a nose!");
    }

    public void fead() {
        System.out.println("");
        if (hungerLevel > 0)
            hungerLevel--;
        else System.out.println("I don't need more food");
    }

}

