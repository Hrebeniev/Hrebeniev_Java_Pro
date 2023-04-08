package com.hillel.hrebeniev.homeworks.homework_12.listOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MainListOperations {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        List<String> listExercise1 = RandomCreator.createRandomStringList(20);
        System.out.println("list = " + listExercise1);
        ListUtils.countOccurrence(listExercise1, listExercise1.get(0));
        System.out.println();

        System.out.println("Exercise 2");
        int[] array = RandomCreator.createRandomIntegerArray(10, 10);
        System.out.println("array = " + Arrays.toString(array));
        List<Integer> listExercise2 = ListUtils.toList(array);
        System.out.println("list = " + listExercise2);
        System.out.println();

        System.out.println("Exercise 3");
        ArrayList<Integer> arrayListExercise3 = RandomCreator.createRandomIntegerArrayList(10, 10);
        System.out.println("arrayList = " + arrayListExercise3);
        System.out.println("uniqueArrayList = " + ListUtils.findUnique(arrayListExercise3));
        System.out.println();

        System.out.println("Exercise 4");
        List<String> listExercise4 = RandomCreator.createRandomStringList(20);
        System.out.println("list = " + listExercise4);
        ListUtils.calcOccurrence(listExercise4);
        System.out.println();

        System.out.println("Exercise 5");
        List<ListUtils.Occurrence> occurrenceList =
                ListUtils.findOccurrence(RandomCreator.createRandomStringList(20));
        for (ListUtils.Occurrence occurrence : occurrenceList) {
            System.out.println(occurrence);
        }
    }
}
