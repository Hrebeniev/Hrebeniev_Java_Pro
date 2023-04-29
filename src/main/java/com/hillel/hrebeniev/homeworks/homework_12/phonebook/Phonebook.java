package com.hillel.hrebeniev.homeworks.homework_12.phonebook;

import lombok.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Value
public class Phonebook {

    List<Record> records;

    public Phonebook() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> recordList = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                recordList.add(record);
            }
        }
        if (!recordList.isEmpty()) {
            return Collections.emptyList();
        } else {
            return null;
        }
    }
}