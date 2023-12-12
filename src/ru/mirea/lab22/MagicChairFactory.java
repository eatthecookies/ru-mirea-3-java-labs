package ru.mirea.lab22;

public class MagicChairFactory extends ChairFactory{
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
