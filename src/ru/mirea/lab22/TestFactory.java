package ru.mirea.lab22;

public class TestFactory {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();

        Chair victorianChair = chairFactory.createVictorianChair();
        Chair magicChair = chairFactory.createMagicanChair();
        Chair multifunctionalChair = chairFactory.createFunctionalChair();

        Client client = new Client();

        client.setChair(victorianChair);
        client.sit();

        client.setChair(multifunctionalChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();
    }

}
