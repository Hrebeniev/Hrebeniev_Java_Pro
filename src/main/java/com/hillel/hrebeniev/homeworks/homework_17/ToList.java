package com.hillel.hrebeniev.homeworks.homework_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToList {

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}