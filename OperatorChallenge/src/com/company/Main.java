package com.company;

public class Main {

    public static void main(String[] args) {

        double myFirstVariable = 20.00d;
        double mySecondVariable = 80.00d;
        double result =  (myFirstVariable + mySecondVariable) * 100.00d;
        System.out.println("result = " + result);
        double remainder = result % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean isNoRemainder = (remainder == 0 ) ? true : false ;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }




    }
}
