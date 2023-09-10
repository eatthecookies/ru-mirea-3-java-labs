package ru.mirea.lab3.task1;

public class Rectangle extends Shape {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
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
