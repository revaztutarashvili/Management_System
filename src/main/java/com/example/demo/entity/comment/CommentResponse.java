package com.example.demo.entity.comment;

public class CommentResponse {

    private String text;

    private String productName;

    public CommentResponse(String text, String productName) {
        this.text = text;
        this.productName = productName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
