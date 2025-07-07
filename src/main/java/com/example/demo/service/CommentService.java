package com.example.demo.service;

import com.example.demo.entity.comment.CommentResponse;
import com.example.demo.repositories.CommentRepository;
import org.hibernate.query.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final ProductService productService;

    public CommentService(CommentRepository commentRepository, ProductService productService) {
        this.commentRepository = commentRepository;
        this.productService = productService;
    }

    public Page<CommentResponse> getCommentsForProduct(Long productId, Integer size, Integer page){
    productService.doesProductExist(productId);
    return commentRepository
            .findCommentsForProduct(productId,
                    (Pageable) PageRequest.of(page, size, Sort.Direction.DESC, "id"));
    }
}
