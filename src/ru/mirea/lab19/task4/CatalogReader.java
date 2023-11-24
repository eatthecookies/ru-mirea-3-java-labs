package ru.mirea.lab19.task4;

import java.util.ArrayList;
import java.io.File;

public class CatalogReader {
    public static void main(String[] args) {
        ArrayList<String> catalogList = listDirectory("C:\\Program Files");
        for(int i = 0; i < 5; i++){
            System.out.println(catalogList.get(i));
        }
    }
    public static ArrayList<String> listDirectory(String path){
        ArrayList<String> list = new ArrayList<>();

        File directory = new File(path);
        if (directory.isDirectory()){
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    list.add(file.getName());
                }
            }
        }
        return list;
    }
}
