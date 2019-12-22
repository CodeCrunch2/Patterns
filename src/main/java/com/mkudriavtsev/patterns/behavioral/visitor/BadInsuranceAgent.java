package main.java.com.mkudriavtsev.patterns.behavioral.visitor;

public class BadInsuranceAgent implements InsuranceAgent {
    @Override
    public void makeOffer(Factory factory) {
        System.out.println("There is nothing to insure in your factory");
    }

    @Override
    public void makeOffer(Bank bank) {
        System.out.println("There is nothing to insure in your bank");
    }
}
