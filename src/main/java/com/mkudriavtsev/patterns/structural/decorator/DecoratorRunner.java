package main.java.com.mkudriavtsev.patterns.structural.decorator;

import main.java.com.mkudriavtsev.patterns.structural.decorator.decorators.GreenShapeDecorator;
import main.java.com.mkudriavtsev.patterns.structural.decorator.shapes.Circle;
import main.java.com.mkudriavtsev.patterns.structural.decorator.shapes.Rectangle;
import main.java.com.mkudriavtsev.patterns.structural.decorator.shapes.Shape;

public class DecoratorRunner {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape greenCircle = new GreenShapeDecorator(new Circle());
        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());
        System.out.println("Simple circle");
        circle.draw();
        System.out.println("Green circle");
        greenCircle.draw();
        System.out.println("Green rectangle");
        greenRectangle.draw();
    }
}
