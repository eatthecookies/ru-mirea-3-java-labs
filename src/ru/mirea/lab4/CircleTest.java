package ru.mirea.lab4;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, 0, 0);
        System.out.println(circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(5.3);
        circle2.setCenterX(4);
        circle2.setCenterY(2);

        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Center: " + circle2.getCenterX() + " " + circle2.getCenterY());
    }
}
