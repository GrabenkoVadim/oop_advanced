package org.example.basesyntax.Suppliers;

import org.example.basesyntax.Figure.*;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public org.example.basesyntax.Figure.Figure getRandomFigure() {
        int randomFigure = new Random().nextInt(4);
        switch (randomFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble(), getRandomDouble());
            case 2:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble());
            default:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }

    public enum Figure {
        Square,
        Rectangle,
        RightTriangle,
        Circle,
        IsoscelesTrapezoid
    }
}
