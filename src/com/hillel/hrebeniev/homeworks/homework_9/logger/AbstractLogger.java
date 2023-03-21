package com.hillel.hrebeniev.homeworks.homework_9.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel.INFO;
import static com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel.DEBUG;

public abstract class AbstractLogger {


    public void info(String message) {
        log(INFO, message);
    }

    public void debug(String message) {
        log(DEBUG, message);
    }


    protected abstract void log(LoggingLevel level, String message);


    protected String getFormattedMessage(LoggingLevel level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        String logLevel = "[" + level.toString() + "]";
        return String.format("%s%s %s", timestamp, logLevel, message);
    }
}
