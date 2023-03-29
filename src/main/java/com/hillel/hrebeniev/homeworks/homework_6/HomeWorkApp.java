package com.hillel.hrebeniev.homeworks.homework_6;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5, 1);
        printColor(50);
        compareNumbers(10, 2);
        System.out.println(isSumInRange(5, 1));
        printNumber(0);
        System.out.println(isNegative(0));
        printString("writing", 4);
        System.out.println(isLeapYear(2023));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100 && value > 0) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return (sum) >= 10 && (sum) <= 20;
    }

    public static void printNumber(int number) {
        if (number >= 0) {
            System.out.println(number + " - додатнє число");
        } else {
            System.out.println(number + " - від'ємне число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printString(String string, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
