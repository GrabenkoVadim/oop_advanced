package org.example.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String Color, double base, double height) {
        super(Color);
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle" + ", area: " + getArea() + "sq.units, color: " + getColor() + ", base: " + getBase() + ", height: " + getHeight());
    }
}
