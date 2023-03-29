package com.hillel.hrebeniev.homeworks.homework_9.stdoutLogger;

import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggerConfLoader;
import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StdoutLoggerConfLoader extends LoggerConfLoader {

    public static StdoutLoggerConfiguration load(String configPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(configPath))) {
            String logLevel = null;
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length != 2) {
                    continue;
                }

                String key = parts[0].trim().toUpperCase();
                String value = parts[1].trim();

                if (key.equals("LEVEL")) {
                    logLevel = value.toUpperCase();
                }
            }
        }
    }
}

