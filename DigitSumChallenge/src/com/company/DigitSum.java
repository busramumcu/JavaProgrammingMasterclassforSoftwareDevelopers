package com.company;

public class DigitSum {
    public static int sumDigits (int number) {
       int sumOfDigit = 0;
       int sumDigits = 0;

       if (number < 10) {
           return -1;
       }

        while (number >  0) {
            sumOfDigit = number % 10;
            sumDigits += sumOfDigit;
            number = number / 10;
        }
        return sumDigits;
    }
}
