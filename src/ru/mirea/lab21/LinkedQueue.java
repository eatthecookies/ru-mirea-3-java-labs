package ru.mirea.lab21;

public class LinkedQueue <T>{
    private Node<T> front;
    private Node<T> rear;
    private int currentSize;

    public LinkedQueue() {
        front = null;
        rear = null;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (currentSize == 0) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        currentSize++;
    }

    public T dequeue() {
        if (currentSize == 0){
            System.out.println("Очередь пуста");
            return null;
        }

        T data = front.data;
        front = front.next;
        currentSize--;

        if (currentSize == 0) {
            rear = null;
        }

        return data;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
