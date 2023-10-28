package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Credit card payment" + amount);
        return amount > 0;
    }
}