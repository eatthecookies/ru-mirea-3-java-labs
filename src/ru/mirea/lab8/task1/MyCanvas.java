package ru.mirea.lab8.task1;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyCanvas extends Canvas {
    public int getRandom(int min, int max) {
        return (int) (Math.random() * ((max + 1) - min) + min);
    }

    public void paint(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;

        Color[] colors = {Color.RED, Color.BLUE, Color.MAGENTA, Color.cyan, Color.yellow, Color.GREEN};
        for (int i = 0; i < 20; i++) {

            int randInt = getRandom(1, 3);
            int x = getRandom(100, 700);
            int y = getRandom(100, 500);
            Color color = colors[getRandom(0, 5)];
            int height, width, radius;

            switch (randInt) {
                case 1:
                    radius = getRandom(50, 200);
                    Circle circle = new Circle(color, x, y, radius);
                    circle.paint(g);
                    break;
                case 2:
                    width = getRandom(50, 200);
                    height = getRandom(50, 200);
                    Rectangle rectangle = new Rectangle(color, x, y, width, height);
                    rectangle.paint(g);
                    break;
                case 3:
                    height = getRandom(50, 200);
                    Triangle triangle = new Triangle(color, x, y, height);
                    triangle.paint(g);
                    break;
            }

        }


    }
}
