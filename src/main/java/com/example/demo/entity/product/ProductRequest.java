package com.example.demo.entity.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductRequest {
    @NotBlank(message = "can't be blank")
    private Integer count;

    @NotBlank(message = "can't be blank")
    private String name;

    @NotBlank(message = "can't be blank")
    private String description;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
