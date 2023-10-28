package ua.edu.ucu.apps.flowerstore.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.price = flower.price;
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
    }

    public Flower() {

    }

    public Flower(int i, double v, FlowerColor flowerColor, FlowerType flower_type) {
        price = i;
        flowerType = flower_type;
        color = flowerColor;
        sepalLength = v;
    }

    public String getColor() {
        return color.toString();
    }
}
