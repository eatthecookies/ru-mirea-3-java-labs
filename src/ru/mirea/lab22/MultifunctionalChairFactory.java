package ru.mirea.lab22;

public class MultifunctionalChairFactory extends ChairFactory{
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
