package org.example.basesyntax.Figure;

import org.example.basesyntax.behaviour.AreaCalculator;
import org.example.basesyntax.behaviour.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String Color;
    protected Figure(String Color){
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
