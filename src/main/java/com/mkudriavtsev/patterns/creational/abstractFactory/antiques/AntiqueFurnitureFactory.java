package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.antiques;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Bed;
import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Chair;
import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.FurnitureFactory;
import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Table;

public class AntiqueFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new AntiqueChair();
    }

    @Override
    public Table getTable() {
        return new AntiqueTable();
    }

    @Override
    public Bed getBed() {
        return new AntiqueBed();
    }
}
