package ua.edu.ucu.apps.flowerstore.store;

import java.util.ArrayList;
import java.util.List;
public class FlowerBucket {
    private List<FlowerPack> boquete = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: boquete) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        boquete.add(flowerPack);
    }
}