package com.company;

public class Main {

    public static void main(String[] args) {

        //System.out.println(EvenNumber.isEvenNumber(90));
        //System.out.println(EvenNumber.isEvenNumber(123));

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int evenSum = 0;

        while ( number <= finishNumber) {
            number ++;
            if(!EvenNumber.isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenCount ++;
            evenSum += number;
            if (evenCount == 5) break;
        }
        System.out.println("Count of even numbers " + evenCount);
        System.out.println("Sum of even numbers " + evenSum);
    }
}
