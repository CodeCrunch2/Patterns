package main.java.com.mkudriavtsev.patterns.creational.factory;

public class Train implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Train rides");
    }
}
