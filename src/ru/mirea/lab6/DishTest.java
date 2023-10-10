package ru.mirea.lab6;

public class DishTest {
    public static void main(String[] args) {
        Plate plate1 = new Plate("Керамика", 500, true);
        Mug mug1 = new Mug("Стекло", 10, 250);

        plate1.use();
        plate1.wash();
        plate1.breakDish();

        System.out.println();
        mug1.use();
        mug1.wash();
        mug1.heatBeverage();
        System.out.println();

        Plate plate2 = new Plate();
        plate2.setFlat(false);
        plate2.setMass(500);
        plate2.setMaterial("Стекло");

        System.out.println("Plate2: \n(is flat) " + plate2.isFlat() + "\nmass " + plate2.getMass() + "\nmaterial " + plate2.getMaterial());

        Mug mug2 = new Mug();
        mug2.setCapacity(300);
        mug2.setMass(300);
        mug2.setMaterial("Фарфор");

        System.out.println("\nMug2: \ncapacity " + mug2.getCapacity() + "\nmass " + mug2.getMass() + "\nmaterial " + mug2.getMaterial());
    }
}
