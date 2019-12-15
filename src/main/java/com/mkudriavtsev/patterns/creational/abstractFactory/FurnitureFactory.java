package main.java.com.mkudriavtsev.patterns.creational.abstractFactory;

public interface FurnitureFactory {
    Chair getChair();
    Table getTable();
    Bed getBed();
}
