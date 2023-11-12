package ru.mirea.lab14;

import java.util.ArrayList;
import java.util.Collection;

public class Test14 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("item1");
        al.add("item2");
        al.add("item3");
        WaitList<String> wl = new WaitList<>(al);
        wl.add("item4");
        System.out.println(wl);

        wl.remove();
        System.out.println(wl);
        System.out.println(wl.isEmpty());
        System.out.println(wl.contains("item2"));

        ArrayList<String> alTest = new ArrayList<>();
        alTest.add("item2");
        alTest.add("item3");
        System.out.println(wl.containsAll(alTest));

        System.out.println();

        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("bitem1");
        bwl.add("bitem2");
        bwl.add("bitem3");
        try {
            bwl.add("bitem4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bwl);

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(3);
        uwl.add(4);
        System.out.println(uwl);
        uwl.remove(2);
        System.out.println(uwl);
        uwl.MoveToBack(3);
        System.out.println(uwl);
    }
}
