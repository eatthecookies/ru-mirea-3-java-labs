package ru.mirea.lab10.task4;

public class CountNumbers {
    public static int count_numbers(int k, int s, int start_digit, int current_sum){
        if (k == 0)
            if (current_sum == s)
                return 1;
            else
                return 0;

        int count = 0;

        for (int digit = start_digit; digit < 10; digit++) {
            if (current_sum + digit <= s){
                count += count_numbers(k - 1, s, digit, current_sum + digit);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count_numbers(2, 5, 0, 0));

    }
}
