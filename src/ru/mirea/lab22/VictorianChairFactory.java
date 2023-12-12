package ru.mirea.lab22;

public class VictorianChairFactory extends ChairFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
