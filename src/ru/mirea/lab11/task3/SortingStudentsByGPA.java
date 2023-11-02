package ru.mirea.lab11.task3;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getScore() - o2.getScore());
    }
}
