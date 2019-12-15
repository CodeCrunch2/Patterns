package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.modern;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Bed;

public class ModernBed implements Bed {
    @Override
    public void lieDown() {
        System.out.println("Lie on the modern bed");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
