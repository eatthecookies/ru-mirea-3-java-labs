package ru.mirea.lab10.task5;

public class CountNumbersSum  {
    public static int countNumbersSum(int n, int current_sum){
        if (n == 0)
            return current_sum;

        return countNumbersSum(n / 10, current_sum + n % 10);
    }
    public static void main(String[] args) {
        System.out.println(countNumbersSum(124, 0));

    }
}
