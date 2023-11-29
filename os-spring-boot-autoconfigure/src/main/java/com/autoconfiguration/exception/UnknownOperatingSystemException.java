package com.autoconfiguration.exception;

public class UnknownOperatingSystemException extends RuntimeException {
    public UnknownOperatingSystemException(String message) {
        super(message);
    }
}
