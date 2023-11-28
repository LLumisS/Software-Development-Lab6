package org.example.flowers;

import java.util.InputMismatchException;

public class Tulip extends Flower{
    private static double defaultPrice = 17.49;

    public Tulip(int freshness, double length) {
        super(freshness, length, defaultPrice);
    }

    public Tulip(int freshness, double length, double price) {
        super(freshness, length, price);
    }

    @Override
    public void smell() {
        System.out.println("This flower smells tulip <3");
    }

    public static void setDefaultPrice(double price) {
        if (price < 0) {
            throw new InputMismatchException("Cannot set negative price");
        }

        defaultPrice = price;
    }
}
