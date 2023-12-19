package ru.mirea.lab24;

public interface MenuItem extends Comparable<MenuItem>{
    public double getCost();
    public String getName();
    public String getDescription();

    @Override
    int compareTo(MenuItem o);
}
