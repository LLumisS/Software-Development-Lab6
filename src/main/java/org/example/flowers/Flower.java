package org.example.flowers;

import java.util.InputMismatchException;

public abstract class Flower {
    private int freshness;
    private double length;

    public Flower(int freshness, int length) {
        if (length <= 0 || freshness <= 0) {
            throw new InputMismatchException("Expected positive numbers");
        }

        this.freshness = freshness;
        this.length = length;
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
            throw new InputMismatchException("You cannot cut negative length");
        }

        this.length -= length;
    }

    public int getFreshness() {
        return freshness;
    }

    public double getLength() {
        return length;
    }
}
