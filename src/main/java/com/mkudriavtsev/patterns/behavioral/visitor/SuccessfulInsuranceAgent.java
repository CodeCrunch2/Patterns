package main.java.com.mkudriavtsev.patterns.behavioral.visitor;

public class SuccessfulInsuranceAgent implements InsuranceAgent {

    @Override
    public void makeOffer(Factory factory) {
        System.out.println("I am a god in factory insurance. Trust me.");
    }

    @Override
    public void makeOffer(Bank bank) {
        System.out.println("I am a god in bank insurance. Trust me.");
    }
}
