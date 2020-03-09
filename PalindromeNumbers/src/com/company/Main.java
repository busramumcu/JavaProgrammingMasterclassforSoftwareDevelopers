package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int tempNum = number;

        if (number < 0) {
            tempNum = number * -1;
            number = number * -1;
        }

        while (number > 0) {
            lastDigit = number % 10;
            number /= 10;
            reverse = (reverse * 10) + lastDigit;
        }

        if (reverse == tempNum) {
            return true;
        } else {
            return false;
        }
    }
}

