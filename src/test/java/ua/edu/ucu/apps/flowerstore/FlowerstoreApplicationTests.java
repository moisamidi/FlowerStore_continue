package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ua.edu.ucu.apps.flowerstore.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.delievery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delievery.PostDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.store.Flower;
import ua.edu.ucu.apps.flowerstore.store.FlowerType;
import ua.edu.ucu.apps.flowerstore.store.FlowerColor;
import ua.edu.ucu.apps.flowerstore.store.Order;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lab74ApplicationTests {

	@Test
	void testPayment() {
		Flower tulip = new Flower(16, 5.0, FlowerColor.RED, FlowerType.TULIP);
		Flower rose = new Flower(10, 1.0, FlowerColor.BLUE, FlowerType.ROSE);

		CreditCardPaymentStrategy cred = new CreditCardPaymentStrategy();
		PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
		Order order = new Order();
		order.addItem(rose);
		double price_order = order.getPriceB();
		assertTrue(cred.pay(price_order));

		order.addItem(tulip);
		double price_order2 = order.getPriceB();
		assertTrue(paypal.pay(price_order2));

	}

	@Test
	void testDelivery() {
		Flower tulip = new Flower(16, 5.0, FlowerColor.RED, FlowerType.TULIP);
		Flower rose = new Flower(10, 1.0, FlowerColor.BLUE, FlowerType.ROSE);

		DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();
		PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();

		ArrayList<Flower> items = new ArrayList<>();
		items.add(tulip);
		items.add(rose);

		String dhlAddress = "DHL Address";
		dhlDeliveryStrategy.deliver(dhlAddress);
		String dhlDeliveryMessage = dhlDeliveryStrategy.received();
		assertEquals("DHL to " + dhlAddress, dhlDeliveryMessage);

		String postAddress = "Post Address";
		postDeliveryStrategy.deliver(postAddress);
		String postDeliveryMessage = postDeliveryStrategy.received();
		assertEquals("POST to " + postAddress, postDeliveryMessage);

	}
}