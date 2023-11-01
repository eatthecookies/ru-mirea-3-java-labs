package ru.mirea.lab11.task2;

import java.util.Arrays;
class TestClass {
    public static void main(String[] args) {
        Student[] array = new Student[]{new Student(102, "Alex", 12), new Student(104, "Max", 5), new Student(106, "Tom", 42), new Student(101, "Bob", 100)};
        for (Student s: array){
            System.out.println(s);
        }
        System.out.println("------------");
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();

        array = mergeSort(array, comparator);

        for (Student s: array){
            System.out.println(s);
        }
    }


    private static Student[] merge(Student[] left, Student[] right, SortingStudentsByGPA comparator){
        Student[] result = new Student[left.length + right.length];

        int resIn = 0, leftIn = 0, rightIn = 0;

        while (leftIn < left.length && rightIn < right.length)
            if (comparator.compare(left[leftIn], right[rightIn]) < 0)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }
    public static Student[] mergeSort(Student[] src, SortingStudentsByGPA comparator) {
        if (src.length <= 1)
            return src;

        Student[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        Student[] right = Arrays.copyOfRange(src, left.length, src.length);

        return merge(mergeSort(left,comparator), mergeSort(right,comparator),comparator);
    }
}
