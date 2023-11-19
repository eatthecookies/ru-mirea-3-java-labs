package ru.mirea.lab15;

import java.util.ArrayList;
import java.util.Objects;

public class MVCPatternDemo {
    public static void main(String[] args) {
        ArrayList<Student> students =new ArrayList<>();

        students.add(new Student("Alex", "#FAS1314"));
        students.add(new Student("Ivan", "#FAKO214"));
        students.add(new Student("Alexey", "#ASA9984"));


        Student model = retriveStudentFromDataBase(students, "Alex");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        System.out.println();

        model = retriveStudentFromDataBase(students, "Ivan");
        view = new StudentView();
        controller = new StudentController(model, view);
        controller.updateView();

        System.out.println();

        model = retriveStudentFromDataBase(students, "Alex");
        view = new StudentView();
        controller = new StudentController(model, view);

        System.out.println();

        controller.setStudentName("Alexander");
        controller.setStudentRollNo("#FSUBI131");
        controller.updateView();



    }

    public static Student retriveStudentFromDataBase(ArrayList<Student> array, String name){
        for(Student student: array){
            if (Objects.equals(student.getName(), name)){
                return student;
            }
        }
       return null;
    }
}
