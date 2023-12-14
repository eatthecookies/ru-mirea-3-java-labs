package ru.mirea.lab21;

public class LinkedQueue extends AbstractQueue{
    private Node<Integer> front;
    private Node<Integer> rear;


    public LinkedQueue() {
        front = null;
        rear = null;
        currentSize = 0;
    }



    public void enqueue(Integer data) {
        Node<Integer> newNode = new Node<>(data);

        if (currentSize == 0) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        currentSize++;
    }

    public Integer dequeue() {
        if (currentSize == 0){
            System.out.println("Очередь пуста");
            return null;
        }

        Integer data = front.data;
        front = front.next;
        currentSize--;

        if (currentSize == 0) {
            rear = null;
        }

        return data;
    }

    private static class Node<Integer> {
        private Integer data;
        private Node<Integer> next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }
}
