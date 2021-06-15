package com.example.smartmenu.exception;

import java.text.MessageFormat;

public class FileNotFoundException extends RuntimeException {
    private static final String DEFAULT_MESSAGE_FORMAT = "Resource with name {0} not found!";
    public FileNotFoundException(String message) {
        super(MessageFormat.format(DEFAULT_MESSAGE_FORMAT, message));
    }
}
