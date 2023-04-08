package com.hillel.hrebeniev.homeworks.homework_12.phonebook;

class MainPhonebook {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        phoneBook.add(new Record("Nick", "+380981234567"));
        phoneBook.add(new Record("Nick", "+380981111111"));
        phoneBook.add(new Record("Alex", "+380991234567"));
        phoneBook.add(new Record("Gregory", "+380992222222"));
        phoneBook.add(new Record("Alex", "+380914444444"));
        phoneBook.add(new Record("Alex", "+380973333333"));

        System.out.println(phoneBook.find("Nick"));
        System.out.println(phoneBook.findAll("Alex"));
    }
}