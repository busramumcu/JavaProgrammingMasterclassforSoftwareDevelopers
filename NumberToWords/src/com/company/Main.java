package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWords(11);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }


    public static int getDigitCount(int number) {

        int countDigit = 0;
        int remainder = 0;

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            countDigit++;
            remainder = number % 10;
            number /= 10;

        }
        return countDigit;
    }

    public static int reverse(int num) {

        int originalInteger = num;
        int reversedInteger = 0;
        int remainder = 0;

        if (num < 0) {
            num = num * -1;
            originalInteger = num * -1;

            while (num != 0) {
                remainder = num % 10;
                reversedInteger = reversedInteger * 10 + remainder;
                num /= 10;
            }
            return reversedInteger * -1;
        } else {
            while (num != 0) {
                remainder = num % 10;
                reversedInteger = reversedInteger * 10 + remainder;
                num /= 10;
            }
            return reversedInteger;
        }
    }
    public static void numberToWords(int number) {
    String numString = "";
        if (number < 0) {
        System.out.println("Invalid Value");
    }
    int numDigits = getDigitCount(number);
    int reverseNum = reverse(number);
    int testNum = 0;
        while (numDigits > 0) {
        testNum = reverseNum % 10;
        reverseNum /= 10;
        numDigits -= 1;
        if (testNum == 0) {
            numString += "Zero ";
        } else {
            switch (testNum) {
                case 1:
                    numString += "One ";
                    break;
                case 2:
                    numString += "Two ";
                    break;
                case 3:
                    numString += "Three ";
                    break;
                case 4:
                    numString += "Four ";
                    break;
                case 5:
                    numString += "Five ";
                    break;
                case 6:
                    numString += "Six ";
                    break;
                case 7:
                    numString += "Seven ";
                    break;
                case 8:
                    numString += "Eight ";
                    break;
                case 9:
                    numString += "Nine";
                    break;
            }
        }
    }
        System.out.println(numString);

}

}