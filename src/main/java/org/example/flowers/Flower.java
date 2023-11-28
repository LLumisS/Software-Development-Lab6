package org.example.flowers;

import java.util.InputMismatchException;

public abstract class Flower {
    private int freshness;
    private double length;
    private double price;

    public Flower(int freshness, double length, double price) {
        if (length <= 0 || freshness <= 0 || price < 0) {
            throw new InputMismatchException("Expected positive numbers");
        }

        this.freshness = freshness;
        this.length = length;
        this.price = price;
    }

    public abstract void smell();

    public void wither() {
        if (freshness == 0) {
            System.out.println("This flower is already withered...");
        } else {
            freshness--;
        }
    }

    public void cut(int length) {
        if (length < 0) {
            throw new InputMismatchException("Cannot cut negative length");
        }

        this.length -= length;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new InputMismatchException("Cannot set negative price");
        }

        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }
}
