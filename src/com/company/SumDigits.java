package com.company;

public class SumDigits {
    public static int sumDigits (int number) {
        if(number < 10) {
            return -1;
        }
        int sum = 0;

        //125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5. Because this is an int.
        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;
            number /= 10; //drop the least significant digit
        }
        return sum;
    }
}
