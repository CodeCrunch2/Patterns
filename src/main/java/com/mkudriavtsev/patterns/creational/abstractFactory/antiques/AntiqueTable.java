package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.antiques;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Table;

public class AntiqueTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Put on the antique table");

    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
