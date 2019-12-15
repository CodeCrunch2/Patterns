package main.java.com.mkudriavtsev.patterns.creational.factory;

public class Car implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Car rides");
    }
}
