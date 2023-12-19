package ru.mirea.lab23;

import ru.mirea.lab24.Alcoholable;
import ru.mirea.lab24.DrinkTypeEnum;

public final class Drink  implements MenuItem {
    private double cost;
    private String name;
    private String description;
    public Drink(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    public Drink(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public double getCost(){
        return this.cost ;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    @Override
    public int compareTo(MenuItem o) {
        return (int) (o.getCost() - cost);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
