package main.java.com.mkudriavtsev.patterns.behavioral.visitor;

public class Bank implements InsuranceObject {
    @Override
    public void offer(InsuranceAgent insuranceAgent) {
        insuranceAgent.makeOffer(this);
    }
}
