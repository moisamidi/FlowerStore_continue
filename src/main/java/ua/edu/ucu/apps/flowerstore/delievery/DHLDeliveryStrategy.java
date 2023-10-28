package ua.edu.ucu.apps.flowerstore.delievery;

public class DHLDeliveryStrategy implements Delivery {
    private String deliveryMessage;

    @Override
    public void deliver(String address) {
        deliveryMessage = "DHL to " + address;
    }

    @Override
    public String received() {
        return deliveryMessage;
    }
}