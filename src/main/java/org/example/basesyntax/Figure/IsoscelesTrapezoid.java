package org.example.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double bottomBase;
    private double topBase;

    public IsoscelesTrapezoid(String Color, double height, double bottomBase, double topBase) {
        super(Color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getHeight() {
        return height;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid" + ", area: " + getArea() + " sq.units, color: " + getColor());
    }
}
