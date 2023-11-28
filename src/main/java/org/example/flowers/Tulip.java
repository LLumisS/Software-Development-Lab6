package org.example.flowers;

import java.util.InputMismatchException;

public class Tulip extends Flower{
    public Tulip(int freshness, double length) {
        super(freshness, length, 17.49);
    }

    public Tulip(int freshness, double length, double price) {
        super(freshness, length, price);
    }

    @Override
    public void smell() {
        System.out.println("This flower smells tulip <3");
    }
}
