package com.hillel.hrebeniev.homeworks.homework_9.fileLogger;

import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggerConfLoader;
import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// fix
public class FileLoggerConfLoader extends LoggerConfLoader {


    public static FileLoggerConfiguration LoggerConfiguration(String configPath) throws IOException {
        String path;
        String logLevel;
        long maxFileSize;
        String fileFormat;
        try (BufferedReader reader = new BufferedReader(new FileReader(configPath))) {

            path = null;
            logLevel = null;
            maxFileSize = 0;
            fileFormat = null;
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length != 2) {
                    continue;
                }

                String key = parts[0].trim().toUpperCase();
                String value = parts[1].trim();

                switch (key) {
                    case "FILE":
                        path = value;
                        break;
                    case "LEVEL":
                        logLevel = value.toUpperCase();
                        break;
                    case "MAX-SIZE":
                        try {
                            maxFileSize = Long.parseLong(value);
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "FORMAT":
                        fileFormat = value.toLowerCase();
                        break;
                    default:
                        System.err.println("unknown key");
                        break;
                }
            }
        }
        return new FileLoggerConfiguration(path, LoggingLevel.valueOf(logLevel), maxFileSize,
                fileFormat);
    }
}
