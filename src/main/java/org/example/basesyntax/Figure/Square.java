package org.example.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(String Color, int side) {
        super(Color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square" + ", area: " + getArea() + "sq.units, color: " + getColor() + " side: " + side);
    }
}
