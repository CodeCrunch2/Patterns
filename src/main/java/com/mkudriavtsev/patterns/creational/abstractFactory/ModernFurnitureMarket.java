package main.java.com.mkudriavtsev.patterns.creational.abstractFactory;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.modern.ModernFurnitureFactory;

public class ModernFurnitureMarket {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        Chair chair = furnitureFactory.getChair();
        Table table = furnitureFactory.getTable();
        Bed bed = furnitureFactory.getBed();

        chair.sitOn();
        bed.lieDown();
        table.putOn();
    }
}
