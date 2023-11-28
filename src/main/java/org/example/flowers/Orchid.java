package org.example.flowers;

public class Orchid extends Flower {
    public Orchid(int freshness, int length) {
        super(freshness, length);
    }

    @Override
    public void smell() {
        System.out.println("This flower smells orchid <3");
    }
}
