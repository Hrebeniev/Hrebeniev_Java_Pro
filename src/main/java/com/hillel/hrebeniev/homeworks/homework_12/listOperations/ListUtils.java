package com.hillel.hrebeniev.homeworks.homework_12.listOperations;

import lombok.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ListUtils {

    public static int countOccurrence(List<String> list, String str) {
        int count = 0;
        for (String word : list) {
            if (word.equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
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

    public static Map<String, Integer> calcOccurrence(List<String> list) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : list) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }

    @Value
    public static class Occurrence implements Comparable<Occurrence> {
        String word;
        int count;
        @Override
        public int compareTo(Occurrence occurrence) {
            return this.word.compareTo(occurrence.word);
        }
    }

    public static List<Occurrence> findOccurrence(List<String> list) {
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