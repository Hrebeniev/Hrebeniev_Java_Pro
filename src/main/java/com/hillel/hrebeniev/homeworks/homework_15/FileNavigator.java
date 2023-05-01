package com.hillel.hrebeniev.homeworks.homework_15;

import lombok.Data;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@Data
public class FileNavigator {
    private final Map<String, Set<FileData>> fileMap;

    public FileNavigator() {
        this.fileMap = new HashMap<>();
    }

    public void add(String path, FileData file) {
        if (!file.getPath().equals(path)) {
            throw new IllegalArgumentException(
                    "Cannot add file with path " + file.getPath() + " to directory " + path);
        }
        fileMap.computeIfAbsent(path, k -> new HashSet<>()).add(file);
    }

    public Set<FileData> find(String path) {
        return fileMap.getOrDefault(path, new HashSet<>());
    }

    public Set<FileData> filterBySize(String path, long size) {
        if (!fileMap.containsKey(path)) {
            return new HashSet<>();
        }
        Set<FileData> filteredSet = new HashSet<>();
        for (FileData file : fileMap.get(path)) {
            if (file.getSize() <= size) {
                filteredSet.add(file);
            }
        }
        return filteredSet;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public Set<FileData> sortBySize(String path) {
        if (!fileMap.containsKey(path)) {
            return new HashSet<>();
        }
        Set<FileData> filteredSet = new TreeSet<>(Comparator.comparingLong(FileData::getSize));
        filteredSet.addAll(fileMap.get(path));

        return filteredSet;
    }
}