package com.hillel.hrebeniev.homeworks.homework_12.listOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomCreator {
    public static List<String> createRandomStringList(int listSize) {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        String[] words = {"apple", "banana", "cherry", "kiwi", "lemon", "mango"};

        for (int i = 0; i < listSize; i++) {
            list.add(words[random.nextInt(words.length)]);
        }
        return list;
    }

    static int[] createRandomIntegerArray(int arraySize, int maxNumber) {
        int[] array = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxNumber);
        }
        return array;
    }

    static ArrayList<Integer> createRandomIntegerArrayList(int listSize, int maxNumber) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(maxNumber));
        }
        return list;
    }
}