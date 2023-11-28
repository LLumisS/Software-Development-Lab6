package org.example.flowers;

public class Rose extends Flower {
    public Rose(int freshness, int length) {
        super(freshness, length);
    }

    @Override
    public void smell() {
        System.out.println("This flower smells rose <3");
    }
}
