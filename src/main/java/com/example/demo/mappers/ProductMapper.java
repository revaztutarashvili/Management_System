package com.example.demo.mappers;

import com.example.demo.entity.product.ProductEntity;
import com.example.demo.entity.product.ProductRequest;
import com.example.demo.entity.product.ProductResponse;

public class ProductMapper {

    public static ProductEntity mapRequestToEntity(ProductRequest productRequest){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setCount(productRequest.getCount());
        productEntity.setDescription(productRequest.getDescription());
        productEntity.setName(productRequest.getName());
        return productEntity;
    }

    public static ProductResponse mapEntityToResponse(ProductEntity productEntity){
    ProductResponse productResponse = new ProductResponse();
    productResponse.setName(productEntity.getName());
    productResponse.setCount(productEntity.getCount());
    productResponse.setDescription(productEntity.getDescription());
    return productResponse;
    }
}
