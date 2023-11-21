package ru.mirea.lab17;

public class NotValidINNException extends Exception{
    public NotValidINNException(String errorMessage) {
        super(errorMessage);
    }
}
