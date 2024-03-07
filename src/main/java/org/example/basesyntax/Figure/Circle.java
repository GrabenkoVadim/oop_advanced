package org.example.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String Color, int radius) {
        super(Color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle" + ", area: " + getArea() + " sq. units, color: " + getColor() + " Radius: " + getRadius());
    }
}
