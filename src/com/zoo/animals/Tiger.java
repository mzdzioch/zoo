package com.zoo.animals;

/**
 * Created by mzdzioch on 2017-08-26.
 */
public class Tiger extends Animal {

    public Tiger() {
        //zawoła metode konstruktora klasy bazowej Tiger i zmodyfikujemy hungryLevel
        super();
        System.out.println("hello from Tiger() constructor");
    }

    public Tiger(String name, Integer hungerLevel) {
        super(hungerLevel);
        setName(name);
        System.out.println("Hello from Tiger(hungerconstructor) Tiger constructor!");
    }
}
