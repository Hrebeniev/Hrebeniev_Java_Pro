package com.hillel.hrebeniev.homeworks.homework_12.listOperations;

import lombok.Value;

import java.util.*;

class ListUtils {

    static void countOccurrence(List<String> list, String str) {
        int count = 0;
        for (String word : list) {
            if (word.equals(str)) {
                count++;
            }
        }
        System.out.println("The word " + str + " occurs " + count + " times");
    }

    static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    static void calcOccurrence(List<String> list) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : list) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    @Value
    static class Occurrence {
        String word;
        int count;
    }

    static List<Occurrence> findOccurrence(List<String> list) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : list) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        List<Occurrence> occurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            Occurrence occurrence = new Occurrence(entry.getKey(), entry.getValue());
            occurrences.add(occurrence);
        }
        return occurrences;
    }
}