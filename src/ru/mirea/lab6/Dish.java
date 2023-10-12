package ru.mirea.lab6;

abstract class Dish {
    private String material;
    private int mass;
    public Dish() {
    }

    public Dish(String material, int mass) {
        this.material = material;
        this.mass = mass;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public abstract void use();

    public void wash() {
        System.out.println("Мою посуду");
    }
}
