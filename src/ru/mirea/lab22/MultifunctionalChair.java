package ru.mirea.lab22;

public class MultifunctionalChair  implements Chair{
    @Override
    public void sit() {
        System.out.println("Сижу на мультифункциональном стуле!");
    }
}
