package ru.mirea.lab24;

public interface Order {
    public boolean add(MenuItem item);
    public String[] itemsNames();
    public int itemsQuantity();
    public int itemQuantity(String itemName);
    public int itemQuantity(MenuItem itemName);
    public MenuItem [] getItems();
    public boolean remove(String itemName);
    public boolean remove(MenuItem item);
    public int removeAll(String itemName);
    public int removeAll(MenuItem item);
    public MenuItem[] sortedItemsByCost();
    public double costTotal();
    public Customer getCustomer();
    public void setCustomer(Customer customer);
}
