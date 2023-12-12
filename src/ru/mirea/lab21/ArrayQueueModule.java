package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayQueueModule{
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public ArrayQueueModule(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public int element(){
        if (currentSize == 0){
            System.out.println("Очередь пуста");
            return -1;
        }
        return queueArray[front];
    }

    public void enqueue(int item){
        if (currentSize == maxSize) {
            System.out.println("Очередь переполнена");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
    }

    public int dequeue(){
        if (currentSize == 0){
            System.out.println("Очередь пуста");
            return -1;
        }
        int item = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return item;
    }

    public int size() {
        return currentSize;
    }
    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void clear(){
        front = 0;
        rear = -1;
        currentSize = 0;
    }
}
