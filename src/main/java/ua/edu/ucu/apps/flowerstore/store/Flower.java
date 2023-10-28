package ua.edu.ucu.apps.flowerstore.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private double price;
    private FlowerType flowerType;
    private FlowerColor color;
    private double sepalLength;

    public Flower(Flower flower) {
        this.price = flower.price;
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
    }

    public Flower() {

    }

    public Flower(int i, double v, FlowerColor flowerColor, FlowerType flowerType) {
    }

    public String getColor() {
        return color.toString();
    }
}
