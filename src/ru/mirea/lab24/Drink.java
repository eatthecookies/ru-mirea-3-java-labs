package ru.mirea.lab24;

import java.util.Objects;

public final class Drink  implements MenuItem, Alcoholable{
    private double cost;
    private String name;
    private String description;
    private double alcoholVol;
    private DrinkTypeEnum type;

    public  Drink(int  cost,  String  name,  String  description,  double alcoholVol, DrinkTypeEnum type)
    {
        this.cost = cost;
        this.name = name;
        this.description = description;
        this.alcoholVol = alcoholVol;
        this.type = type;

        if (cost < 0 || Objects.equals(description, "") || Objects.equals(name, ""))
            throw new IllegalArgumentException();
    }

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

    public DrinkTypeEnum getType() {
        return type;
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
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0.0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
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
