package ru.mirea.lab19.task1;

import java.util.ArrayList;

public class Test {
    public static <T> ArrayList<T> arrayToList(T[] array){
        ArrayList<T> list = new ArrayList<>();
        for(T element : array){
            list.add(element);
        }
        return list;
    }
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4};
        ArrayList<Integer> list = arrayToList(array);
        System.out.println(list);


        String[] stringArray = {"Hello", "world", "its", "me"};
        ArrayList<String> stringList = arrayToList(stringArray);
        System.out.println(stringList);
    }
}
