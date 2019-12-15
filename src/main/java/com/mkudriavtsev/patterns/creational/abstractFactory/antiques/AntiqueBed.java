package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.antiques;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Bed;

public class AntiqueBed implements Bed {
    @Override
    public void lieDown() {
        System.out.println("Lie on the antique bed");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
