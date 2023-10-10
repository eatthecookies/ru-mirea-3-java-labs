package ru.mirea.lab5.task5;


public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, length: " + this.length + " width: " + this.width;
    }
}
