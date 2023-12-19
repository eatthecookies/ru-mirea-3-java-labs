package ru.mirea.lab23;

public interface MenuItem extends Comparable<MenuItem>{
    public double getCost();
    public String getName();
    public String getDescription();

    @Override
    int compareTo(MenuItem o);
}
