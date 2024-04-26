package org.example.constant;

public enum ErrorInfo {
    Test("001", "test message");

    private String code;
    private String message;

    ErrorInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
