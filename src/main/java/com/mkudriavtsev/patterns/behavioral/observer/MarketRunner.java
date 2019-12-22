package main.java.com.mkudriavtsev.patterns.behavioral.observer;

public class MarketRunner {
    public static void main(String[] args) {
        Market market = new Market();
        market.addProduct("Pizza");
        market.addProduct("Bicycle");

        Observer buyer1 = new Buyer("Viktor Orban");
        Observer buyer2 = new Buyer("Alex Hilton");

        market.addObserver(buyer1);
        market.addObserver(buyer2);

        market.addProduct("Rings");
        market.addProduct("Pets");
    }
}
