package com.hillel.hrebeniev.homeworks.homework_8;

public interface StringArrayInterface {
    String get(int row, int col);

    void set(int row, int col, String value);

    int numRows();

    int numCols();
}
