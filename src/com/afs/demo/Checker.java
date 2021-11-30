package com.afs.demo;

import java.util.Arrays;

public class Checker {
    public Boolean checkCuteNumber(int[] numbers) {
        int[] evenNumbers = findAllEvenNumbers(numbers);
        int largestNumber = findLargestNumber(evenNumbers);
        boolean isGreaterThan10 = isGreaterThan10(largestNumber);
        return isGreaterThan10;
    }

    private boolean isGreaterThan10(int number) {
        return number > 10;
    }

    private int findLargestNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    private int[] findAllEvenNumbers(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index++] = number;
            }
        }

        return Arrays.copyOfRange(evenNumbers, 0, index);
    }
}
