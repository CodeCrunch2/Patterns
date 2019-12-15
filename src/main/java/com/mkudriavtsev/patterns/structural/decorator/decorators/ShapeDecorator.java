package main.java.com.mkudriavtsev.patterns.structural.decorator.decorators;

import main.java.com.mkudriavtsev.patterns.structural.decorator.shapes.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
