package ru.mirea.lab3.task2;

public class Square extends Rectangle {
    protected double side;

    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Shape: square, a: "+this.a+", b: "+this.b;
    }
}
