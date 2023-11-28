package org.example;

import org.example.classes.*;
import org.example.classes.flowers.*;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose(7, 30);
        Iris iris = new Iris(5, 25.5);
        Tulip tulip = new Tulip(10, 35, 23.99);
        Flower[] flowers = new Flower[]{ rose, iris, tulip };

        Accessory ribbon = new Accessory("Ribbon", 4.99);
        Accessory[] accessories = new Accessory[]{ ribbon };

        Bouquet bouquet = new Bouquet(flowers, accessories);

        System.out.println(bouquet.getBouquet() + "\n");

        bouquet.sortFlowersByFreshness();
        System.out.println(bouquet.getBouquet() + "\n");

        System.out.println(bouquet.getFlowersByLength(25, 30));
    }
}