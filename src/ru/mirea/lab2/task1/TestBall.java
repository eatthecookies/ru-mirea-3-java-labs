package ru.mirea.lab2.task1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        Ball b2 = new Ball();
        b2.setX(100);
        b2.setY(50);
        System.out.println(b2.getX());
        System.out.println(b2.getY());
        b1.setXY(20,50);
        System.out.println(b2);
    }
}