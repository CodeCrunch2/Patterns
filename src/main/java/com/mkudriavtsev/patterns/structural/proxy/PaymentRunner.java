package main.java.com.mkudriavtsev.patterns.structural.proxy;

import com.sun.org.apache.xml.internal.resolver.readers.XCatalogReader;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new CreditCard(500);
        payment.pay(200);

    }
}
