package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.antiques;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Chair;

public class AntiqueChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sit on the antique chair");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
