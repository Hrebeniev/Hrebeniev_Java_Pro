package com.hillel.hrebeniev.homeworks.homework_8;

public class ArrayExceptions extends Exception {

    public ArrayExceptions(String errorMessage) {
        super(errorMessage);
    }

    static class ArraySizeExceptions extends ArrayExceptions {

        public ArraySizeExceptions(String errorMessage) {
            super(errorMessage);
        }
    }

    static class ArrayDataExceptions extends ArrayExceptions {

        public ArrayDataExceptions(String errorMessage, NumberFormatException exception) {
            super(errorMessage);
        }
    }
}
