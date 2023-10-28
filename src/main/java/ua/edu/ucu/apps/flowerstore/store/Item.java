package ua.edu.ucu.apps.flowerstore.store;

import lombok.Getter;

@Getter
public abstract class Item {
    private String description;

    public abstract double getPrice();
    public Item(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
