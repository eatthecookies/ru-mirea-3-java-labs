package ru.mirea.lab13.task1;

import java.io.*;
import java.util.Scanner;

public class FilesTest {
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