package com.hillel.hrebeniev.homeworks.homework_9.fileLogger;
// fix
public class FileMaxSizeReachedException extends Exception {

    long currentSize;
    long maxSize;
    String path;

    public FileMaxSizeReachedException(long currentSize, long maxSize, String path) {
        this.currentSize = currentSize;
        this.maxSize = maxSize;
        this.path = path;
        String errMessage = String.format(
                "File max size reached. Current size: %d bytes. Max size: %d bytes. Path %s",
                currentSize, maxSize, path);

    }

}
