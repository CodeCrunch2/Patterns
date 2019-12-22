package main.java.com.mkudriavtsev.patterns.structural.proxy;

public class Cash implements Payment{
    private int cash;

    public Cash(int cash) {
        this.cash = cash;
        countMoney();
    }

    public int countMoney() {
        System.out.println("You have " + cash + "$");
        return cash;

    }

    @Override
    public void pay(int amount) {
        if(cash < amount) {
            System.out.println("Not enough money");
        }
        else {
            System.out.println("$" + amount + " payment completed");
            cash -= amount;
        }

    }
}
