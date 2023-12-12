package ru.mirea.lab21;

public class ArrayQueueATD {
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public ArrayQueueATD(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public static int element(ArrayQueueATD queue){
        if (queue.currentSize == 0){
            System.out.println("Очередь пуста");
            return -1;
        }
        return queue.queueArray[queue.front];
    }

    public static void enqueue(ArrayQueueATD queue, int item){
        if (queue.currentSize == queue.maxSize) {
            System.out.println("Очередь переполнена");
            return;
        }
        queue.rear = (queue.rear + 1) % queue.maxSize;
        queue.queueArray[queue.rear] = item;
        queue.currentSize++;
    }

    public static int dequeue(ArrayQueueATD queue){
        if (queue.currentSize == 0){
            System.out.println("Очередь пуста");
            return -1;
        }
        int item = queue.queueArray[queue.front];
        queue.front = (queue.front + 1) % queue.maxSize;
        queue.currentSize--;
        return item;
    }

    public static int size(ArrayQueueATD queue) {
        return queue.currentSize;
    }
    public static boolean isEmpty(ArrayQueueATD queue) {
        return queue.currentSize == 0;
    }

    public static void clear(ArrayQueueATD queue){
        queue.front = 0;
        queue.rear = -1;
        queue.currentSize = 0;
    }
}
