package ua.edu.ucu.apps.flowerstore.delievery;
public class PostDeliveryStrategy implements Delivery {
    private String deliveryMessage;

    @Override
    public void deliver(String address) {
        deliveryMessage = "POST to " + address;
    }

    @Override
    public String received() {
        return deliveryMessage;
    }
}