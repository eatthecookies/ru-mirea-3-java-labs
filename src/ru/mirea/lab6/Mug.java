package ru.mirea.lab6;

public class Mug extends Dish {
    private int capacity;

    public Mug() {
    }

    public Mug(String material, int mass, int capacity) {
        super(material, mass);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void use() {
        System.out.println("Пью из кружки");
    }

    public void heatBeverage(){
        System.out.println("Подогреваю напиток в кружке");
    }
}
