package com.hillel.hrebeniev.homeworks.homework_12.phonebook;

import java.util.ArrayList;
import java.util.List;

class Phonebook {

    private final List<Record> records;

    public Phonebook() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);
    }

    Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    List<Record> findAll(String name) {
        List<Record> recordList = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                recordList.add(record);
            }
        }
        if (!recordList.isEmpty()) {
            return recordList;
        } else {
            return null;
        }
    }
}