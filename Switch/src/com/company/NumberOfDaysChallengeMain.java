package com.company;

import Challenge.NumberOfDaysInMonth;

public class NumberOfDaysChallengeMain {
    public static void main(String[] args) {

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(0,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(Challenge.NumberOfDaysInMonth.getDaysInMonth(1,2018));
        System.out.println(Challenge.NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(Challenge.NumberOfDaysInMonth.getDaysInMonth(0,-2020));


    }

}
