package ru.mirea.lab8.task2;

public class RunApplication {
    public static void main(String[] args) {
        if (args.length != 0)
            new Application(args[0]);
        else
            System.out.println("Программа запущена без аргументов...");
    }
}
