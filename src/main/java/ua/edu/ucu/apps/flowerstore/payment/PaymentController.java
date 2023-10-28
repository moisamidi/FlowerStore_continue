package ua.edu.ucu.apps.flowerstore.payment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping("/credit_pay")
    String getCreditCard(@RequestParam double price) {
        CreditCardPaymentStrategy cred = new CreditCardPaymentStrategy();
        if (cred.pay(price)){
            return "SUCCESS";
        }
        return "FAIL";
    }


    @GetMapping("/paypal")
    String getPayPal(@RequestParam double price) {
        PayPalPaymentStrategy pal = new PayPalPaymentStrategy();
        if (pal.pay(price)){
            return "SUCCESS";
        }
        return "FAIL";
    }

}