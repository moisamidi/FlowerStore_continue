package ua.edu.ucu.apps.flowerstore.store;

public class Store {
    public void search(Flower searchflower) {
        FlowerType type = searchflower.getFlowerType();

        if (type == FlowerType.CHAMOMILE) {
            System.out.println("CHAMOMILE");
        } else if (type == FlowerType.ROSE) {
            System.out.println("ROSE");
        } else {
            System.out.println("TULIP");
        }
    }
}
