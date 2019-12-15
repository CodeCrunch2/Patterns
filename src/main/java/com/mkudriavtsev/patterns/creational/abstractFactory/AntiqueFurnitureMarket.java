package main.java.com.mkudriavtsev.patterns.creational.abstractFactory;

import main.java.com.mkudriavtsev.patterns.creational.abstractFactory.antiques.AntiqueFurnitureFactory;

public class AntiqueFurnitureMarket {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new AntiqueFurnitureFactory();
        Chair chair = furnitureFactory.getChair();
        Table table = furnitureFactory.getTable();
        Bed bed = furnitureFactory.getBed();

        chair.sitOn();
        bed.lieDown();
        table.putOn();

    }
}
