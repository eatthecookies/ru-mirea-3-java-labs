package ru.mirea.lab14;

import java.util.ArrayList;

public class lab14 {
    public static void main(String[] args) {

/*        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("item1");
        arrayList.add("item2");
        arrayList.add("item3");

        WaitList<String> waitList = new WaitList<>(arrayList);
        waitList.add("item4");
        System.out.println(waitList);
        waitList.remove();
        System.out.println(waitList);
        System.out.println(waitList.isEmpty());
        System.out.println(waitList.contains("item2"));

        ArrayList<String> alTest = new ArrayList<>();
        alTest.add("item2");
        alTest.add("item3");
        System.out.println(waitList.containsAll(alTest));

        System.out.println();

        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(3);
        boundedWaitList.add("bitem1");
        boundedWaitList.add("bitem2");
        boundedWaitList.add("bitem3");*/
//        try {
//            boundedWaitList.add("bitem4");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(boundedWaitList);

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        unfairWaitList.add(4);
        System.out.println(unfairWaitList);

        unfairWaitList.remove(2);
        System.out.println(unfairWaitList);
//        unfairWaitList.add(2);
        unfairWaitList.remove(1);

        System.out.println(unfairWaitList);

        System.out.println(unfairWaitList);
        unfairWaitList.MoveToBack(3);
        System.out.println(unfairWaitList);
    }
}
