package ru.mirea.lab24;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
//        InternetOrder order = new InternetOrder(new MenuItem[]{new Dish(10, "Пицца", "pizza")});
//        order.add(new Drink(90, "Пицца", "pizza"));
//        System.out.println(order.itemQuantity("Пицца"));
//        System.out.println(Arrays.toString(order.getItems()));
//        System.out.println(Arrays.toString(order.itemsNames()));
//        System.out.println(Arrays.toString(order.sortedItemsByCost()));
//        order.remove("Пицца");
//        System.out.println(Arrays.toString(order.itemsNames()));


        TableOrdersManager ordersManager = new TableOrdersManager();

        Dish dish1 = new Dish(90, "Пицца", "Пицца");
        Dish dish2 = new Dish(60, "Хачапури" , "Хачапури по-аджарски");
        Dish dish3 = new Dish(160, "Сендвич" , "Сендвич с ветчиной и сыром");

        Drink  drink1  =  new  Drink(90,  "Сок",  "Виноградный сок",  0.0, DrinkTypeEnum.JUICE);
        Drink  drink2  =  new  Drink(160,  "Пиво",  "Пиво",  0.2, DrinkTypeEnum.BEER);
        Drink drink3 = new Drink(150, "Водка", "Водка", 0.35, DrinkTypeEnum.VODKA);

        Order order1 = new TableOrder();
        order1.add(dish1);
        order1.add(drink2);
        order1.setCustomer(new  Customer("Артуро",  "Галлиярди",  31,  new Address()));
        ((TableOrdersManager)ordersManager).add(order1, 1);

        Order order2 = new TableOrder();
        order2.add(dish2);
        order2.add(dish2);
        order2.add(dish1);
        order2.add(drink3);
        order2.setCustomer(new  Customer("Элиза",  "Маркс",  15,  new Address()));
        ordersManager.add(order2, 2);

        Order order3 = new TableOrder();
        order3.add(dish1);
        order3.add(dish3);
        order3.setCustomer(new  Customer("Петя",  "Петров",  25,  new Address()));
        ordersManager.add(order3, 3);


        ordersManager.addItem(drink1, 1);
        ordersManager.addItem(dish3, 1);

        ordersManager.addItem(dish3, 2);
        ordersManager.addItem(drink3, 2); // элиза заказывает водку...

        ordersManager.addItem(dish2, 3);
        ordersManager.addItem(drink3, 3);


        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();

        Order internetOrder1 = new InternetOrder();
        internetOrder1.add(drink3);
        internetOrder1.add(dish3);
        internetOrder1.setCustomer(new  Customer("Вася",  "Петров",  29,  new Address()));
        internetOrdersManager.add(internetOrder1);


        for (Order order : ordersManager.getOrders())
        {
            if (order != null)
            {
                System.out.println("Заказ  "  +  order.getCustomer().getFirstName()  +  "  "  + order.getCustomer().getSecondName() +  "  "
                        + order.getCustomer().getAge() + ": ");
                System.out.print("{ ");
                for (String names : order.itemsNames()) {
                    System.out.print(names + " ");
                }
                System.out.println("}");
            }
        }

        for (Order order : internetOrdersManager.getOrders())
        {
            if (order != null)
            {
                System.out.println("Заказ  "  +  order.getCustomer().getFirstName()  +  "  "  + order.getCustomer().getSecondName() +  "  "
                        + order.getCustomer().getAge() + ": ");
                System.out.print("{ ");
                for (String names : order.itemsNames()) {
                    System.out.print(names + " ");
                }
                System.out.println("}");
            }
        }
        System.out.println();


        System.out.println("Количество  Сендвичей  в  заказах:  "  + ordersManager.itemsQuantity("Сендвич"));
        System.out.println("Количество  Хачапури  в  заказах:  "  + ordersManager.itemsQuantity("Хачапури"));
        System.out.println("Количество  Сока  в  заказах:  "  + ordersManager.itemsQuantity("Сок"));
        System.out.println();

        System.out.println("Количество  заказов:  "  + (ordersManager.ordersQuantity()+ internetOrdersManager.ordersQuantity()));
        System.out.println("Сумарная  стоимость  заказов:  "  + (ordersManager.ordersCostSummary() + internetOrdersManager.ordersCostSummary()));
        System.out.println();


        ordersManager.remove(order1);
        ordersManager.remove(1);

        ordersManager.remove(3);
        ordersManager.remove(2);

        System.out.println("Количество  заказов:  "  + ordersManager.ordersQuantity());
        System.out.println();

        System.out.println("Номера свободных столов: ");
        for  (int  table  :
            ordersManager.freeTableNumbers())
        {
            System.out.print(table + " ");
        }
    }
}
