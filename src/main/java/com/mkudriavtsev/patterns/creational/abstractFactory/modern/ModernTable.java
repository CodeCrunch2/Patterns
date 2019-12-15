package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.modern;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Table;

public class ModernTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Put on the modern table");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
