package ru.mirea.lab11.task1;
public class TestClass {
    public static void main(String[] args) {
        Student[] array = new Student[]{new Student(102, "Alex"), new Student(104, "Max"), new Student(106, "Tom"), new Student(101, "Bob")};
        for (Student s: array){
            System.out.println(s);
        }

        System.out.println("------------");

        // Сортировка вставками
        for (int index = 1; index < array.length; index++)
        {
            Student key = array[index];
            int position = index;
            // Shift larger values to the right
            while (position > 0 && key.compareTo(array[position-1]) < 0) {
                array[position] = array[position-1];
                position--;
            }

            array[position] = key;
        }
        for (Student s: array){
            System.out.println(s);
        }
    }
}