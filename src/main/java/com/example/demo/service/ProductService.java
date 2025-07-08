package com.example.demo.service;

import com.example.demo.entity.product.ProductEntity;
import com.example.demo.entity.product.ProductRequest;
import com.example.demo.entity.product.ProductResponse;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.repositories.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final UserService userService;


    public ProductService(ProductRepository productRepository, UserService userService) {
        this.productRepository = productRepository;
        this.userService = userService;
    }

    public ProductResponse create(Long userId, ProductRequest request){

        ProductEntity productEntity = ProductMapper.mapRequestToEntity(request);
        productEntity.setProductOwner(userService.findById(userId));
        ProductEntity saveProduct = productRepository.save(productEntity);
        return ProductMapper.mapEntityToResponse(saveProduct);

    }


    public ProductResponse view (Long productId){
        ProductEntity productEntity = productRepository.findById(productId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "product not found"));
        return ProductMapper.mapEntityToResponse(productEntity);
    }

    public void delete(Long productId){
        productRepository.deleteById(productId);
    }

    public void doesProductExist(Long userId){
        boolean b = productRepository.existsById(userId);
        if (!b){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"product doesn't exist");
        }
    }


    public ProductEntity findById(Long productId){
        return productRepository.findById(productId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "product not found"));

    }
}
