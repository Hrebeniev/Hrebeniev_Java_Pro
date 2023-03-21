package com.hillel.hrebeniev.homeworks.homework_9.fileLogger;

import com.hillel.hrebeniev.homeworks.homework_9.logger.AbstractLogger;
import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggerConfiguration;
import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel;

import static com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel.INFO;
import static com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel.DEBUG;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger extends AbstractLogger {

    private final FileLoggerConfiguration configuration;
    private File currentLogFile;


    public FileLogger(LoggerConfiguration configuration) {
        this.configuration = configuration;
        this.currentLogFile = createNewLogFile();
    }

    //create a new file
    private File createNewLogFile() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        String newName = String.format("%s_%s.%s", "log", LocalDateTime.now().format(formatter),
                configuration.getFileFormat());

        String fullLogFilePath = configuration.getPath() + newName;
        File logFile = new File(fullLogFilePath);
        try {
            Thread.sleep(
                    1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return logFile;
    }

    @Override
    public void debug(String message) {
        log(DEBUG, message);
    }

    @Override
    public void info(String message) {
        log(INFO, message);
    }


    @Override
    protected void log(LoggingLevel level, String message) {
        String formattedMessage = getFormattedMessage(level, message);
        long messageSize = formattedMessage.getBytes().length;

        try {
            checkFileMaxSize(messageSize);
        } catch (FileMaxSizeReachedException e) {
            currentLogFile = createNewLogFile();
        }

        if (level.ordinal() <= configuration.getLogLevel().ordinal()) {
            writeToFile(currentLogFile, formattedMessage);
        }
    }


    //check file size and size from config
    private void checkFileMaxSize(long messageSize) throws FileMaxSizeReachedException {
        long fileSize = currentLogFile.length();
        long maxFileSize = configuration.getMaxFileSize();

        if (fileSize + messageSize >= maxFileSize) {
            throw new FileMaxSizeReachedException(fileSize + messageSize, maxFileSize,
                    currentLogFile.getPath());
        }
    }

    //write a message to the file
    public void writeToFile(File currentLogFile, String message) {
        try (FileWriter fileWriter = new FileWriter(currentLogFile, true);
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(message);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
