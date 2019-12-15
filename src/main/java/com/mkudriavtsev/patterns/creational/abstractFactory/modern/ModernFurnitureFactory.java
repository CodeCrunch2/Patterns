package main.java.com.mkudriavtsev.patterns.creational.abstractFactory.modern;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Bed;
import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Chair;
import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.FurnitureFactory;
import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }

    @Override
    public Bed getBed() {
        return new ModernBed();
    }
}
