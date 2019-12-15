package main.java.com.mkudriavtsev.patterns.structural.decorator.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
