package com.example.demo.mappers;

import com.example.demo.entity.product.ProductEntity;
import com.example.demo.entity.product.ProductRequest;

public class ProductMapper {

    public static ProductEntity mapRequestToEntity(ProductRequest productRequest){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setCount(productRequest.getCount());
        productEntity.setDescription(productRequest.getDescription());
        productEntity.setName(productEntity.getName());
        return productEntity;
    }
}
