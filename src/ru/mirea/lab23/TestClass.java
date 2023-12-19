package ru.mirea.lab23;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        InternetOrder order = new InternetOrder(new MenuItem[]{new Dish(10, "Пицца", "pizza")});
        order.add(new Drink(90, "Пицца", "pizza"));
        System.out.println(order.itemQuantity("Пицца"));
        System.out.println(Arrays.toString(order.getItems()));
        System.out.println(Arrays.toString(order.itemsNames()));
        System.out.println(Arrays.toString(order.sortedItemsByCost()));
        order.remove("Пицца");
        System.out.println(Arrays.toString(order.itemsNames()));


    }
}
