package com.example.demo.entity.product;

public class ProductResponse {

    private Integer count;

    private String name;

    private String description;

    public ProductResponse() {
    }

    public ProductResponse(Integer count, String name, String description) {
        this.count = count;
        this.name = name;
        this.description = description;
    }

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
