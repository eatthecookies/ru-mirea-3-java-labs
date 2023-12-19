package ru.mirea.lab23;

public class ListNode {
    private ListNode next;
    private ListNode prev;
    private MenuItem value;

    public ListNode getNext() {
        return next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public MenuItem getValue() {
        return value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public void setValue(MenuItem value) {
        this.value = value;
    }
}
