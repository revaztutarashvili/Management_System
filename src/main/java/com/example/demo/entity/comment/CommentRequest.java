package com.example.demo.entity.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CommentRequest {
    @NotBlank(message = "text field shouldn't be blank")
    @Size(min = 1, max = 512, message = "text should be between 1 - 512")
    private String text;

    @Positive(message = "product id should be positive")
    @NotNull(message = "id can't be null!")
    private Long productId;




    public CommentRequest() {
    }

    public CommentRequest(String text, Long productId) {
        this.text = text;
        this.productId = productId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
