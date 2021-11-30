package com.afs.demo;

public class Main {
    public static void main(String[] args) {
        Checker checker = new Checker();
        Boolean result = checker.checkCuteNumber(new int[]{1, 2, 4, 18});

        System.out.println("Check cute number if it is greater than 10: " + result);
    }
}
