package ru.mirea.lab3.task3;

abstract class Shape {
    protected boolean filled;
    protected String color;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString() {
        return "Shape{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
