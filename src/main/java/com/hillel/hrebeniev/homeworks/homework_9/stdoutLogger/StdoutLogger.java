package com.hillel.hrebeniev.homeworks.homework_9.stdoutLogger;

import com.hillel.hrebeniev.homeworks.homework_9.logger.AbstractLogger;
import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel;

public class StdoutLogger extends AbstractLogger {
    private StdoutLoggerConfiguration configuration;

    public StdoutLogger(StdoutLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    protected void log(LoggingLevel level, String message) {
        if (level.ordinal() <= configuration.getLogLevel().ordinal()) {
            System.out.println(getFormattedMessage(level, message));
        }
    }
}
