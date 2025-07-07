package com.example.demo.entity.product;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.NotNull;

public class ProductRequest {
    @NotNull(message = "can't be null")
    private Integer coount;

    @NotNull(message = "can't be null")
    private String name;

    private String description;

    public Integer getCoount() {
        return coount;
    }

    public void setCoount(Integer coount) {
        this.coount = coount;
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
