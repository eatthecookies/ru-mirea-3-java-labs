package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Winnie the Pooh", 1949);
        Book b2 = new Book("Harry Potter");
        Book b3 = new Book("Jane Eyre");
        Book b4 = new Book();
        System.out.println("Name of the 4 book: " + b4.getName());
        System.out.println("Year of the 4 book: " + b4.getYear());
        b2.setName("Harry potter and the philosopher stone");
        b4.setYear(1002);
        b3.setYear(1987);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
