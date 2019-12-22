package main.java.com.mkudriavtsev.patterns.behavioral.visitor;

public interface InsuranceAgent {
    void makeOffer(Factory factory);
    void makeOffer(Bank bank);
}
