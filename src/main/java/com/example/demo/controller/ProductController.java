package com.example.demo.controller;

import com.example.demo.entity.product.ProductRequest;
import com.example.demo.entity.product.ProductResponse;
import com.example.demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")//აქ გავუწერ Path-ს
public class ProductController {
    /**
     * აქ შემომაქვს პროდუქტების სერვის კლასი და ვუკეთებ კონსტრუქტორს
     * */
    private final ProductService productService;
    public ProductController(ProductService productService) {this.productService = productService;
    }

/**
 * აქ ვამატებ პროდუქტს
 * */
    @PostMapping
    public ResponseEntity<ProductResponse> productResponse
            (@RequestParam("userId")Long userId, @RequestBody @Valid ProductRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(userId,request));
    }
    /**
     * აქ მომაქვს პროდუქტები ID-ით
     * */
    @GetMapping("/{productId}")
    public  ResponseEntity<ProductResponse> view
            (@PathVariable("productId") Long productId){
        return ResponseEntity.status(HttpStatus.OK).body(productService.view(productId));
    }


    /**
     * აქ წავშლი პროდუქტებს ID-ით
     * */
    @DeleteMapping("/{productId}")
    public ResponseEntity<ProductResponse> deleteProduct
            (@PathVariable("productId")Long productId){productService.delete(productId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
