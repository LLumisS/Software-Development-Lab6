package org.example.flowers;

import java.util.InputMismatchException;

public class Iris extends Flower {
    public Iris(int freshness, double length) {
        super(freshness, length, 16.99);
    }

    public Iris(int freshness, double length, double price) {
        super(freshness, length, price);
    }

    @Override
    public void smell() {
        System.out.println("This flower smells iris <3");
    }
}
