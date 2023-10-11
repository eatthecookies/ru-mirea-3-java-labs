package ru.mirea.lab8.task1;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    void paint(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, radius, radius);
    }
}
