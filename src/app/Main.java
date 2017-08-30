package app;

import com.zoo.animals.Tiger;

public class Main {

    public static void main(String[] args) {

//        Tiger myTiger = new Tiger();
//        Integer hungerLevel = myTiger.getHungerLevel();
//        System.out.println(hungerLevel);

        Tiger myTiger = new Tiger("bubu", 78);
        System.out.println("name " + myTiger.getName() + " " + " hunger: " + myTiger.getHungerLevel());


    }

}
