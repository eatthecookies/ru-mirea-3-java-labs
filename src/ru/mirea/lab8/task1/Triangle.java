package ru.mirea.lab8.task1;

import java.awt.*;

public class Triangle extends Shape{
    private int height;

    public Triangle(Color color, int x, int y, int height) {
        super(color, x, y);
        this.height = height;
    }

    @Override
    void paint(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;

        int halfHeight = height / 2;
        int[] xPoints = {
                x,              // Вершина, расположенная в центре
                x - halfHeight, // Вершина слева
                x + halfHeight  // Вершина справа
        };
        int[] yPoints = {
                y - halfHeight, // Вертикальная координата вершин
                y + halfHeight, // Вертикальная координата вершины снизу
                y + halfHeight  // Вертикальная координата вершины снизу
        };
        int nPoints = 3; // Количество вершин в треугольнике
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, nPoints); // Рисуем треугольник
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, nPoints);
    }
}
