package main.java.com.mkudriavtsev.patterns.structural.decorator.decorators;

import main.java.com.mkudriavtsev.patterns.structural.decorator.shapes.Shape;

public class GreenShapeDecorator extends ShapeDecorator {
    private Shape shape;
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        this.shape = decoratedShape;
    }

    private void setColor (Shape shapeDecorator) {
        System.out.println(String.format("Setting color for %s to green.", shapeDecorator.getClass().getSimpleName()));
    }

    @Override
    public void draw() {
        setColor(shape);
        super.draw();
    }
}
