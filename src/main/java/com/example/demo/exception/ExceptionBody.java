package com.example.demo.exception;

import java.util.List;

public class ExceptionBody {

    private List<String> message;
    private Long timestamp;

    public ExceptionBody() {
    }

    public ExceptionBody(List<String> message) {
        this.message = message;
    }

    public ExceptionBody(Long timestamp) {
        this.timestamp = timestamp;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
