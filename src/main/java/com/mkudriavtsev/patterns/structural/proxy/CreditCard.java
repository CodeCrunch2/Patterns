package main.java.com.mkudriavtsev.patterns.structural.proxy;

public class CreditCard implements Payment {
    private int cash;
    private Cash cashObj;

    public CreditCard(int cash) {
        this.cash = cash;
    }

    @Override
    public void pay(int amount) {
        if (cashObj == null) {
            cashObj = new Cash(cash);
        }
        cashObj.pay(amount);
    }
}
