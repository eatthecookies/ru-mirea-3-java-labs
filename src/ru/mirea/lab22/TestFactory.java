package ru.mirea.lab22;

public class TestFactory {
    public static void main(String[] args) {
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        ChairFactory magicChairFactory = new MagicChairFactory();
        ChairFactory multifuctionalChairFactory = new MultifunctionalChairFactory();

        Chair victorianChair = victorianChairFactory.createChair();
        Chair magicChair = magicChairFactory.createChair();
        Chair multifunctionalChair = multifuctionalChairFactory.createChair();

        Client client = new Client();

        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }

}
