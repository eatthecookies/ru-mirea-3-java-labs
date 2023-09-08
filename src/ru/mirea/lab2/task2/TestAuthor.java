package ru.mirea.lab2.task2;

public class TestAuthor {
    public static void main(String[] args){
        Author author1 = new Author("Jane Smith", "jane.smith@email.com", 'F');
        Author author2 = new Author("John Doe", "john.doe@email.com", 'M');
        Author author3 = new Author("Emily Johnson", " emily.johnson@email.com", 'U');

        System.out.println(author1.getName());
        System.out.println(author2.getEmail());
        System.out.println(author3.getGender());
        author2.setEmail("test@somewhere.com");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
    }
}