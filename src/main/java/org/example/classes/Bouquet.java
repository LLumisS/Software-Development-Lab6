package org.example.classes;

import org.example.classes.flowers.Flower;

import java.util.ArrayList;

public class Bouquet {
    private final Flower[] flowers;
    private final Accessory[] accessories;

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public double getPrice() {
        double price = 0;

        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            price += accessory.getPrice();
        }

        return price;
    }

    private String getFlowerInfo(Flower flower) {
        return flower.getName() + "\t" +
                flower.getFreshness() + "\t" +
                flower.getLength() + "\t" +
                flower.getFreshness();
    }

    public String getFlowersByLength(double from, double to) {
        StringBuilder result = new StringBuilder();

        for (Flower flower : flowers) {
            double length = flower.getLength();
            if (from <= length && length <= to) {
                result.append(getFlowerInfo(flower));
            }
        }

        return result.toString();
    }

    public void sortFlowersByFreshness() {
        int n = flowers.length;
        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flowers[j].getFreshness() > flowers[j + 1].getFreshness()) {
                    Flower temp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public String getBouquet() {
        StringBuilder bouquet = new StringBuilder();

        for (Flower flower : flowers) {
            bouquet.append(getFlowerInfo(flower));
        }
        for (Accessory accessory : accessories) {
            String name = accessory.getName();
            double price = accessory.getPrice();
            bouquet.append(name).append("\t").append("\t").append(price);
        }
        bouquet.append("Total price: ").append(getPrice());

        return bouquet.toString();
    }
}
