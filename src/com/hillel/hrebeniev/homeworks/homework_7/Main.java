package com.hillel.hrebeniev.homeworks.homework_7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2:");
        String taskNumber2Word = "Occurrance";
        char task2Character = 'a';
        System.out.println("Quantity of found characters '" + task2Character + "' in the word " + taskNumber2Word +
                " = " + findSymbolOccurrence(taskNumber2Word, task2Character));
        System.out.println();

        System.out.println("Task 3:");
        String[] taskNumber3 = {"Apollo", "pollo", "Apple", "Plant"};
        System.out.println("Source = " + taskNumber3[0] + ". Target = " + taskNumber3[1] + ". Result = "
                + findWordPosition(taskNumber3[0], taskNumber3[1]));
        System.out.println("Source = " + taskNumber3[2] + ". Target = " + taskNumber3[3] + ". Result = "
                + findWordPosition(taskNumber3[2], taskNumber3[3]));
        System.out.println();

        System.out.println("Task 4:");
        String taskNumber4Word = "Apple";
        System.out.println(taskNumber4Word + " string reverse = " + stringReverse(taskNumber4Word));
        System.out.println();

        System.out.println("Task 5:");
        String[] taskNumber5 = {"ERE", "Allo"};
        System.out.println(taskNumber5[0] + " is palindrome = " + isPalindrome(taskNumber5[0]));
        System.out.println(taskNumber5[1] + " is palindrome = " + isPalindrome(taskNumber5[1]));
        System.out.println();

        System.out.println("Task 6:");
        GuessTheWord();
    }

    private static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    private static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    private static String stringReverse(String str) {
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        return reversedStr.toString();
    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static void GuessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String secretWord = words[random.nextInt(words.length)];
        StringBuilder hiddenWord = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            hiddenWord.append("#");
        }
        String guess;

        do {
            System.out.println("Guess the word: " + hiddenWord);
            guess = scanner.nextLine().toLowerCase();
            if (guess.equals(secretWord)) {
                System.out.println("Congratulations! You guessed the word!");
                return;
            } else {
                StringBuilder partiallyHiddenWord = new StringBuilder(hiddenWord);
                for (int i = 0; i < Math.min(guess.length(), secretWord.length()); i++) {
                    if (guess.charAt(i) == secretWord.charAt(i)) {
                        partiallyHiddenWord.setCharAt(i, guess.charAt(i));
                    }
                }
                hiddenWord = new StringBuilder(partiallyHiddenWord.toString());
            }
        } while (true);
    }
}

