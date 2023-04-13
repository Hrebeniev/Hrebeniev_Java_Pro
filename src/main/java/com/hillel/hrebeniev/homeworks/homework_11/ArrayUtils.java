package com.hillel.hrebeniev.homeworks.homework_11;

public class ArrayUtils {

    public static int[] getElementsAfterLastFour(int[] array) {
        int lastFourIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                lastFourIndex = i;
                break;
            }
        }
        if (lastFourIndex == -1) {
            throw new RuntimeException("Array doesn't have any 4");
        }
        int countElementsToCopy = array.length - lastFourIndex - 1;

        int[] resultArray = new int[countElementsToCopy];
        System.arraycopy(array, lastFourIndex + 1, resultArray, 0, countElementsToCopy);
        return resultArray;
    }


    public static boolean checkArray(int[] array) {
        boolean containsOne = false;
        boolean containsFour = false;

        for (int num : array) {
            if (num == 1) {
                containsOne = true;
            } else if (num == 4) {
                containsFour = true;
            } else {
                return false;
            }
        }
        return containsOne && containsFour;
    }
}