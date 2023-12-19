package ru.mirea.lab24;

import java.util.Objects;

public class Dish implements MenuItem {
    private double cost;
    private String name;
    private String description;

    public Dish(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
        if (cost < 0 || Objects.equals(description, "") || Objects.equals(name, ""))
            throw new IllegalArgumentException();
    }

    public double getCost(){
        return this.cost;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(MenuItem o) {
        return (int) (o.getCost() - cost);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
