package ru.mirea.lab17;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws NotValidINNException {
        System.out.println("ФИО: ");
        Scanner scanner = new Scanner(System.in );
        String fio = scanner.nextLine();

        System.out.println("ИНН: ");
        String inn = scanner.nextLine();

        if (inn.length() == 10 || inn.length() == 12) {
            System.out.println("ИНН действителен");
        }else {
            throw new NotValidINNException("ИНН недействителен");
        }
    }




}
