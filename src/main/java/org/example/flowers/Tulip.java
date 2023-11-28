package org.example.flowers;

public class Tulip extends Flower{
    public Tulip(int freshness, int length) {
        super(freshness, length);
    }

    @Override
    public void smell() {
        System.out.println("This flower smells tulip <3");
    }
}
