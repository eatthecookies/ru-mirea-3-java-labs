package ru.mirea.lab24;

public class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;

    private Customer MATURE_UNKNOWN_CUSTOMER;
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public Customer(int age) {
        if (age < 18){
            NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("", "", age, new Address());
            this.firstName = NOT_MATURE_UNKNOWN_CUSTOMER.firstName;
            this.secondName = NOT_MATURE_UNKNOWN_CUSTOMER.secondName;
            this.address = NOT_MATURE_UNKNOWN_CUSTOMER.address;
        } else {
            MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 18, new Address());
            this.firstName = MATURE_UNKNOWN_CUSTOMER.firstName;
            this.secondName = MATURE_UNKNOWN_CUSTOMER.secondName;
            this.address = MATURE_UNKNOWN_CUSTOMER.address;
        }
    }

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
