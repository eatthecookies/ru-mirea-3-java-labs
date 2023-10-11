package ru.mirea.lab8.task1;

import java.awt.*;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void paint(Graphics graphics);
}
