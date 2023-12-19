package ru.mirea.lab23;


import java.util.Arrays;
import java.util.Objects;

public class InternetOrder {
    private int size;
    private ListNode head = null;
    private ListNode tail = null;

    public InternetOrder() {
        head = new ListNode();
    }
    public InternetOrder(MenuItem[] arr) {
        if (arr.length > 0){
            head = new ListNode();
            head.setValue(arr[0]);

            ListNode current = head;

            for(int i = 1; i < arr.length; i++){
                ListNode node = new ListNode();
                node.setValue(arr[i]);

                current.setNext(node);
                node.setPrev(current);

                current = node;
            }

            tail = current;
            tail.setNext(head);
            head.setPrev(tail);
        }
    }

//добавляющий позицию  в  заказ
    public boolean add(MenuItem item) {
        ListNode node = new ListNode();
        node.setValue(item);

        if (head == null) { // Если список пустой
            head = node;
            tail = node;
            head.setNext(tail);
            head.setPrev(tail);
            tail.setNext(head);
            tail.setPrev(head);
        } else {
            node.setPrev(tail);
            node.setNext(head);
            tail.setNext(node);
            head.setPrev(node);
            tail = node;
        }

        return true;
    }

//удаляющий  позицию  из  заказа  по  его  названию
public boolean remove(String itemName) {
    if (head == null) {
        return false; // Если список пуст, невозможно удалить элемент
    }

    ListNode current = tail;

    do {
        if (current.getValue().getName().equals(itemName)) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                ListNode prev = current.getPrev();
                ListNode next = current.getNext();

                prev.setNext(next);
                next.setPrev(prev);

                if (current == head) {
                    head = next;
                }
                if (current == tail) {
                    tail = prev;
                }
            }

            return true; // Элемент удален успешно
        }
        current = current.getPrev();
    } while (current != tail);

    return false; // Элемент с указанным именем не найден
}


    public boolean removeAll(String itemName) {
        if (head == null) {
            return false; // Если список пуст, невозможно удалить элементы
        }

        boolean removed = false;
        ListNode current = head;

        do {
            if (current.getValue().getName().equals(itemName)) {
                if (head == tail) {
                    head = null;
                    tail = null;
                    return true; // Если в списке всего один элемент и он совпадает с удаляемым
                } else {
                    ListNode prev = current.getPrev();
                    ListNode next = current.getNext();

                    prev.setNext(next);
                    next.setPrev(prev);

                    if (current == head) {
                        head = next;
                    }
                    if (current == tail) {
                        tail = prev;
                    }

                    removed = true; // Успешно удалили хотя бы один элемент
                }
            }
            current = current.getNext();
        } while (current != head);

        return removed; // Возвращаем результат удаления
    }

    //возвращающий массив названий заказанных блюд и напитков
    public String[] itemsNames() {
        if (head == null) {
            return null; // Возвращаем пустой массив, если список пустой
        }
        ListNode current = head.getNext();
        int c = 1;

        while (current != head){
            c++;
            current = current.getNext();
        }

        String[] arr = new String[c];

        for(int j = 0; j < c; j++){
            arr[j] = current.getValue().getName();
            current = current.getNext();
        }

        return arr;
    }


    //возвращающий число заказанных блюд или напитков (принимает
    //название блюда или напитка в качестве параметра).
    public int itemQuantity(String itemName) {
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        int c = 0;

        do {
            if (Objects.equals(current.getValue().getName(), itemName)){
                c++;
            }
            current = current.getNext();
        } while (current != head);

        return c;
    }

//    Возвращающий  массив  заказанных  блюд  и  напитков
    public MenuItem[] getItems() {
        if (head == null) {
            return new MenuItem[0]; // Возвращаем пустой массив, если список пустой
        }
        ListNode current = head.getNext();
        int c = 1;

        while (current != head){
            c++;
            current = current.getNext();
        }

        MenuItem[] arr = new MenuItem[c];

        for(int j = 0; j < c; j++){
            arr[j] = current.getValue();
            current = current.getNext();
        }

        return arr;
    }



    //возвращающий  массив  позиций  заказа,  отсортированный  по
    //убыванию цены.
    public MenuItem[] sortedItemsByCost() {
        if (head == null) {
            return new MenuItem[0]; // Возвращаем пустой массив, если список пустой
        }
        ListNode current = head.getNext();
        int c = 1;

        while (current != head){
            c++;
            current = current.getNext();
        }

        MenuItem[] arr = new MenuItem[c];

        for(int j = 0; j < c; j++){
            arr[j] = current.getValue();
            current = current.getNext();
        }
        Arrays.sort(arr);
        return arr;
    }

    public double costTotal() {
        if (head == null) {
            return 0;
        }
        double cost = head.getValue().getCost();

        ListNode current = head.getNext();
        int c = 1;

        while (current != head){
            cost += current.getValue().getCost();
            current = current.getNext();
        }

        return cost;
    }

}
