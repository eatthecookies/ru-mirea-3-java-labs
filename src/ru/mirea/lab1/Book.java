package ru.mirea.lab1;

public class Book {
    private String name;
    private int year;
    public Book(String n, int y) {
        name = n;
        year = y;
    }

    public Book(String n) {
        name  = n;
        year = 0;
    }

    public Book(){
        name = "Nothing";
        year = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }

}

