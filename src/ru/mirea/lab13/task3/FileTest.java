package ru.mirea.lab13.task3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String scan = scanner.nextLine();

        try(FileWriter writer = new FileWriter("notes1.txt", false))
        {
            writer.write(scan);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
