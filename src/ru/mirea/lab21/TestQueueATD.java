package ru.mirea.lab21;

import static ru.mirea.lab21.ArrayQueueATD.*;

public class TestQueueATD {
    public static void main(String[] args) {
        ArrayQueueATD queue = new ArrayQueueATD(5);

        enqueue(queue,10);
        enqueue(queue,20);
        enqueue(queue,30);

        System.out.println(dequeue(queue) == 10);
        System.out.println(dequeue(queue) == 20);

        enqueue(queue, 40);
        enqueue(queue, 50);

        System.out.println(dequeue(queue) == 30);
        System.out.println(dequeue(queue) == 40);
        System.out.println(dequeue(queue));
        System.out.println(isEmpty(queue));
    }
}
