package ua.edu.ucu.apps.flowerstore.store;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.payment.Payment;
import ua.edu.ucu.apps.flowerstore.delievery.Delivery;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private final List<Flower> items;
    private double price;

    public Order() {
        this.items = new ArrayList<Flower>();
        this.price = 0.0;
    }

    public void addItem(Flower item) {
        items.add(item);
        price += item.getPrice();
    }

    public void removeItem(Flower item) {
        items.remove(item);
        price -= item.getPrice();
    }

    public List<Flower> getItems() {
        return items;
    }

    public double getPriceB() {
        return price;
    }

}
