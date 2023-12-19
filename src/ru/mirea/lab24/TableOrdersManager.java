package ru.mirea.lab24;
import java.util.HashMap;
public class TableOrdersManager implements OrdersManager{
    private Order[] orders;

    private final int NUMBER_OF_TABLES = 20;

    public TableOrdersManager()
    {
        orders = new Order[NUMBER_OF_TABLES];
    }

    public void add(Order order, int tableNumber) {
        try {
            if (tableNumber >= 0 && tableNumber < NUMBER_OF_TABLES) {
                if (orders[tableNumber] == null)
                    orders[tableNumber] = order;
                else throw new OrderAlreadyAddedException("");
            } else if (tableNumber < 0 || tableNumber > NUMBER_OF_TABLES)
                throw new IllegalTableNumber("");
        } catch (OrderAlreadyAddedException e) {
            System.out.println("Столик с таким номером уже заказан");
        } catch (IllegalTableNumber e) {
            System.out.println("Столика с таким номером нет");
        }
    }

    public void addItem(MenuItem item, int tableNumber){
        if (tableNumber >= 0 && tableNumber < NUMBER_OF_TABLES && orders[tableNumber] != null) {
            orders[tableNumber].add(item);
        }
    }
    public int freeTableNumber(){

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] == null)
            {
                return i;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers(){
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] == null)
            {
                map.put(i, true);
            }
        }

        return map.keySet().stream().mapToInt(Integer::intValue).toArray();
    }

    public Order getOrder(int tableNumber){

        return orders[tableNumber];
    }

    public void remove(int tableNumber){
        if (tableNumber >= 0 && tableNumber < NUMBER_OF_TABLES)
        {
            orders[tableNumber] = null;
        }
    }

    public void remove(Order order){
        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] == order) {
                orders[i] = null;
                break;
            }
        }
    }

    public void removeAll(Order order){
        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] == order)
            {
                orders[i] = null;
                System.arraycopy(orders, i + 1, orders, i, orders.length - 1);
            }
        }

    }

    @Override
    public int itemsQuantity(String itemName)
    {
        int quantity = 0;

        for (Order order : orders)
        {
            if (order != null)
            {
                quantity += order.itemQuantity(itemName);
            }
        }

        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item)
    {
        int quantity = 0;

        for (Order order : orders)
        {
            if (order != null)
            {
                quantity += order.itemQuantity(item);
            }
        }

        return quantity;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public double ordersCostSummary()
    {
        double cost = 0;

        for (Order order : orders)
        {
            if (order != null)
            {
                cost += order.costTotal();
            }
        }

        return cost;
    }

    @Override
    public int ordersQuantity() {
        int quantity = 0;

        for (Order order : orders)
        {
            if (order != null)
            {
                quantity++;
            }
        }

        return quantity;
    }
}
