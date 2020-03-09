package com.company;

public class Sum3and5Challenge {
    public static void main(String[] args) {

        int countDivededNumber = 0;
        int sumDividedNumber =0;

        for (int i = 1; i < 1001 ; i++) {
            if (i % 15 == 0) {
                countDivededNumber++;
                sumDividedNumber += i;
                System.out.println(i);
            }
            if (countDivededNumber == 5) {
                break;
            }
        }
        System.out.println("Sum of the numbers = " + sumDividedNumber);
    }
}
