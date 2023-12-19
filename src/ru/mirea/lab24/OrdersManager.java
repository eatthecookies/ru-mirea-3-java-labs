package ru.mirea.lab24;

public interface OrdersManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public double ordersCostSummary();
    public int ordersQuantity();
}
