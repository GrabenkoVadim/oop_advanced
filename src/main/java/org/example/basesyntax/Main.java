package org.example.basesyntax;

import org.example.basesyntax.Figure.Figure;
import org.example.basesyntax.Suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static FigureSupplier figureSupplier = new FigureSupplier();
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        for (int i = 0; i < figures.length; i ++){
            figures[i] = figureSupplier.getRandomFigure();
        }
        for(Figure figure : figures){
            figure.draw();
        }
    }
}