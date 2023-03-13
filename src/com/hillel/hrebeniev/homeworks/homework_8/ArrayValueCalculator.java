package com.hillel.hrebeniev.homeworks.homework_8;

import java.util.HashMap;


public class ArrayValueCalculator {
    public static String[][] getFilledArray(int numRows, int numCols) {
        String[][] array = new String[numRows][numCols];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(counter++);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Array array1 = new Array(getFilledArray(3, 3));
        Array array2 = new Array(getFilledArray(4, 4));
        Array array3 = new Array(getFilledArray(4, 5));
        array3.set(3, 3, "abc");

        HashMap<String, Array> arrayMap = new HashMap<>();
        arrayMap.put("array1", array1);
        arrayMap.put("array2", array2);
        arrayMap.put("array3", array3);

        printResult(arrayMap);
    }


    private static int doCalc(Array array) throws ArrayExceptions {
        int sum = 0;
        int numRows = 4;
        int numCols = 4;

        if (array.numRows() != numRows || array.numCols() != numCols) {
            throw new ArrayExceptions.ArraySizeExceptions("Array size should be 4x4");
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                try {
                    sum += Integer.parseInt(array.get(i, j));
                } catch (NumberFormatException exception) {
                    throw new ArrayExceptions.ArrayDataExceptions("Invalid data in cell [" + i + "][" + j + "]: " + array.get(i, j), exception);
                }
            }
        }
        return sum;
    }

    private static void printResult(HashMap<String, Array> arrayMap) {
        try {
            if (arrayMap.isEmpty()) {
                throw new IllegalArgumentException("The arrayMap is empty");
            }

            arrayMap.forEach((key, value) -> {
                try {
                    int sum = doCalc(value);
                    System.out.println(key + " result = " + sum);
                } catch (ArrayExceptions exception) {
                    System.err.println(key + " result = " + exception.getMessage());
                }
            });
        } catch (IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
