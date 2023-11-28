package org.example.flowers;

import java.util.InputMismatchException;

public class Rose extends Flower {
    public Rose(int freshness, double length) {
        super(freshness, length, 15.99);
    }

    public Rose(int freshness, double length, double price) {
        super(freshness, length, price);
    }

    @Override
    public void smell() {
        System.out.println("This flower smells rose <3");
    }
}
