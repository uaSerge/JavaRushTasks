package com.javarush.task.task37.task3710.decorators;


import com.javarush.task.task37.task3710.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        setBorderColor(decoratedShape);
        decoratedShape.draw();
    }

    private void setBorderColor (Shape shape) {
        System.out.println("Setting border color for "+ shape.getClass().getSimpleName()+" to red.");
    }
}
