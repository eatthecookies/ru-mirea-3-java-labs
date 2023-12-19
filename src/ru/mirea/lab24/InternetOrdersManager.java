package ru.mirea.lab24;

public class InternetOrdersManager implements OrdersManager{
    private QueueNode head;
    private QueueNode tail;
    private int size;

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode current = head;

        while (current != null)
        {
            count += current.getValue().itemQuantity(itemName);
            current = current.getNext();
        }

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode current = head;

        while (current != null)
        {
            count += current.getValue().itemQuantity(item);
            current = current.getNext();
        }

        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];

        QueueNode current = head;
        int count = 0;

        while (current != null)
        {
            orders[count] = current.getValue();
            current = current.getNext();
            count++;
        }

        return orders;
    }

    @Override
    public double ordersCostSummary() {
        double total = 0;
        QueueNode current = head;

        while (current != null)
        {
            total += current.getValue().costTotal();
            current = current.getNext();
        }

        return total;
    }

    @Override
    public int ordersQuantity() {
        int sum = 0;
        QueueNode current = head;

        while (current != null)
        {
            sum += 1;
            current = current.getNext();
        }

        return sum;
    }

    public boolean add(Order newOrder) {
        QueueNode newNode = new QueueNode(null, null, newOrder);
        try {
            for (Order order: this.getOrders()){
                if (order.getCustomer().getAddress() == newOrder.getCustomer().getAddress()){
                    throw new OrderAlreadyAddedException("");
                }
            }
        } catch (OrderAlreadyAddedException e){
            System.out.println("На этот адресс уже оформлен заказ");
        }

        if (head == null)
        {
            head = newNode;
        }
        else
        {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;

        size++;

        return true;
    }

    public Order remove()
    {
        QueueNode del = head;
        head = head.getNext();
        return del.getValue();
    }

    public Order order()
    {
        return head.getValue();
    }
}
