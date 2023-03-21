package com.hillel.hrebeniev.homeworks.homework_9;

import com.hillel.hrebeniev.homeworks.homework_9.stdoutLogger.StdoutLogger;
import com.hillel.hrebeniev.homeworks.homework_9.stdoutLogger.StdoutLoggerConfLoader;
import com.hillel.hrebeniev.homeworks.homework_9.fileLogger.FileLogger;
import com.hillel.hrebeniev.homeworks.homework_9.fileLogger.FileLoggerConfLoader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathToConfig =
                "ю\\src\\com\\hillel\\hrebeniev\\homeworks\\homework_9\\logConfig.txt";

        FileLogger fileLogger = new FileLogger(FileLoggerConfLoader.load(pathToConfig));
        StdoutLogger stdoutLogger =
                new StdoutLogger(StdoutLoggerConfLoader.load(pathToConfig));


        for (int i = 0; i < 20; i++) {
            fileLogger.info("test info" + " " + i);
            fileLogger.debug("test debug" + " " + i);
        }

        for (int i = 0; i < 20; i++) {
            stdoutLogger.info("test info" + " " + i);
            stdoutLogger.debug("test debug" + " " + i);

        }
    }
}
