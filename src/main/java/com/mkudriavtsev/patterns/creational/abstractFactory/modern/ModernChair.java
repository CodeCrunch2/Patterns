package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.modern;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sit on the modern chair");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
