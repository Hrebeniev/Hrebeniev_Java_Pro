package com.hillel.hrebeniev.homeworks.homework_9.fileLogger;

import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggerConfiguration;
import com.hillel.hrebeniev.homeworks.homework_9.logger.LoggingLevel;
// fix
public class FileLoggerConfiguration extends LoggerConfiguration {
    private final String path;
    private final LoggingLevel logLevel;
    private final long maxFileSize;
    private final String fileFormat;

    public FileLoggerConfiguration(String path, LoggingLevel logLevel, long maxFileSize,
                                   String fileFormat) {
        this.path = path;
        this.logLevel = logLevel;
        this.maxFileSize = maxFileSize;
        this.fileFormat = fileFormat;
    }

    public String getPath() {
        return path;
    }

    @Override
    public LoggingLevel getLogLevel() {
        return logLevel;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }


}
