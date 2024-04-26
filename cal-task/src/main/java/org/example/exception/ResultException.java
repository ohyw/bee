package org.example.exception;

public class ResultException extends Exception {
    private String code;
    private String message;

    public ResultException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
