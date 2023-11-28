package org.example.classes;

import org.example.classes.flowers.Flower;

public class Bouquet {
    private Flower[] flowers;
    private Accessory[] accessories;

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

    public String showBouquet() {
        StringBuilder bouquet = new StringBuilder();

        for (Flower flower : flowers) {
            String name = flower.getName();
            int freshness =  flower.getFreshness();
            double price =  flower.getPrice();
            bouquet.append(name).append("\t").append(freshness).append("\t").append(price);
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
