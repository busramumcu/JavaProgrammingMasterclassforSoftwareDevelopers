package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 1,};
        int[] b = {-1, 150, 190, 170, -1, -1, 160, 180};
       // System.out.println(almostIncreasingSequence(a));
        System.out.println(Arrays.toString(sortByHeight(b)));
    }

    static int[] sortByHeight(int[] a) {
       return Arrays.stream(a).filter(n -> n == -1);
    }

    static boolean isLucky(int n) {
        int count1 = 0, count2 = 0;
        int digits = 1 + (int)Math.floor(Math.log10(n));
        int[] digitArray = Arrays.stream(String.valueOf(n).split("(?<=.)")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < digits / 2; i++) {
            count1 += digitArray[i];
            count2 += digitArray[digits - i - 1];
        }
        return count1 == count2;

    }

    public static boolean almostIncreasingSequence(int[] sequence) {

        int i = 0;
        int count = 0;

        while (i < sequence.length - 1) {
            if (sequence[i] > sequence[i + 1]) {
                count++;
            }
            i++;
        }
        if (count > 1) {
            return false;
        } else {
            return true;
        }

    }

    static int makeArrayConsecutive2(int[] statues) {
        return (Arrays.stream(statues).max().getAsInt() - Arrays.stream(statues).min().getAsInt()) - statues.length + 1;
    }

}
