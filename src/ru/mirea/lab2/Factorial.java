package ru.mirea.lab2;

public class Factorial {
    int n;

    public Factorial(int n) {
        this.n = n;
    }

    public int factorial(){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
