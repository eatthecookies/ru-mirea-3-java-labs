package ru.mirea.lab11.task2;

import java.util.Comparator;

public class TestClass {
    public static void main(String[] args) {
        Student[] array = new Student[]{new Student(102, "Alex", 12), new Student(104, "Max", 5), new Student(106, "Tom", 42), new Student(101, "Bob", 100)};
        for (Student s: array){
            System.out.println(s);
        }
        System.out.println("------------");
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        quickSort(array, 0, array.length -1, comparator);

        for (Student s: array){
            System.out.println(s);
        }
    }


    private static void quickSort(Student[] arr, int from, int to, SortingStudentsByGPA comparator){
        if (from < to){
            int divideIndex = partition(arr, from, to,comparator);
            quickSort(arr, from, divideIndex - 1,comparator);
            quickSort(arr, divideIndex, to,comparator);
        }
    }
    public static int partition(Student[] arr, int from, int to, SortingStudentsByGPA comparator){
        int rightIndex = to;
        int leftIndex = from;

        Student pivot = arr[from];
        while (leftIndex <= rightIndex){
            while (leftIndex <= rightIndex){
                while (comparator.compare(arr[leftIndex], pivot) < 0){
                    leftIndex++;
                }

                while (comparator.compare(arr[rightIndex], pivot) > 0){
                    rightIndex--;
                }
                if (leftIndex <= rightIndex) {
                    swap(arr, rightIndex, leftIndex);
                    leftIndex++;
                    rightIndex--;
                }
            }
        }
        return leftIndex;
    }

    private static void swap(Student[] arr, int index1, int index2) {
        Student tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }


}
