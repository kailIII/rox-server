package com.grayfox.server.service.impl;

public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -367567113790654440L;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}