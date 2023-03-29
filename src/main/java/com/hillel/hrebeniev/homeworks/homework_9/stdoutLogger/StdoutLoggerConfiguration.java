package com.hillel.hrebeniev.homeworks.homework_9.stdoutLogger;

import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggerConfiguration;
import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel;
// fix
public class StdoutLoggerConfiguration extends LoggerConfiguration {
    private final LoggingLevel logLevel;

    public StdoutLoggerConfiguration(LoggingLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public LoggingLevel getLogLevel() {
        return logLevel;
    }
}
