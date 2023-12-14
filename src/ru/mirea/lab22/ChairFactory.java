package ru.mirea.lab22;

public class ChairFactory implements AbstractChairFactory{

    @Override
    public Chair createVictorianChair() {
        return new VictorianChair(0);
    }

    @Override
    public Chair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public Chair createFunctionalChair() {
        return new FunctionalChair();
    }
}
