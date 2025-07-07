package com.example.demo.entity.product;

import jakarta.validation.constraints.NotNull;

public class ProductRequest {
    @NotNull(message = "can't be null")
    private Integer count;

    @NotNull(message = "can't be null")
    private String name;

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
