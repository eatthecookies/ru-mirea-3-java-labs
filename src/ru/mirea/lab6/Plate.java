package ru.mirea.lab6;

public class Plate extends Dish{
    private boolean isFlat;

    public Plate() {
    }
    public Plate(String material, int mass, boolean isFlat) {
        super(material, mass);
        this.isFlat = isFlat;
    }

    public boolean isFlat() {
        return isFlat;
    }

    public void setFlat(boolean flat) {
        isFlat = flat;
    }

    @Override
    public void use() {
        System.out.println("Ем с тарелки");
    }

    public void breakDish(){
        System.out.println("Тарелка разбилась!");
    }
}
