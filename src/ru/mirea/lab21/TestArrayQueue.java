package ru.mirea.lab21;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() == 10);
        System.out.println(queue.dequeue() == 20);

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue() == 30);
        System.out.println(queue.dequeue() == 40);
        System.out.println(queue.dequeue() == 50);

    }
}
