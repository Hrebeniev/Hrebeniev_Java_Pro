package com.hillel.hrebeniev.homeworks.homework_8;

public class Array implements StringArrayInterface {
    private final String[][] arr;

    public Array(String[][] arr) {
        this.arr = arr;
    }

    @Override
    public String get(int row, int col) {
        return arr[row][col];
    }

    @Override
    public void set(int row, int col, String value) {
        arr[row][col] = value;
    }

    @Override
    public int numRows() {
        return arr.length;
    }

    @Override
    public int numCols() {
        return arr[0].length;
    }
}
