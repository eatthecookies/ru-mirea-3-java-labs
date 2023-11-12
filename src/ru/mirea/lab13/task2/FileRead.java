package ru.mirea.lab13.task2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("notes1.txt"))
        {
            int c;
            while ((c=reader.read()) != -1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
