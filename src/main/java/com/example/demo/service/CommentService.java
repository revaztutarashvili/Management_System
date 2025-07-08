package com.example.demo.service;

import com.example.demo.entity.comment.CommentEntity;
import com.example.demo.entity.comment.CommentRequest;
import com.example.demo.entity.comment.CommentResponse;
import com.example.demo.entity.product.ProductEntity;
import com.example.demo.mappers.CommentMapper;
import com.example.demo.repositories.CommentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final ProductService productService;

    public CommentService(CommentRepository commentRepository, ProductService productService) {
        this.commentRepository = commentRepository;
        this.productService = productService;
    }


    Page<CommentResponse> getCommentsForProduct(Long productId, Integer size, Integer page){
    productService.doesProductExist(productId);
    return commentRepository
            .findCommentsForProduct(productId,
                    PageRequest.of(page, size, Sort.Direction.DESC , "id"));
    }


    public CommentResponse create(CommentRequest request){
    ProductEntity productEntity = productService.findById(request.getProductId());

       CommentEntity commentEntity = CommentMapper.mapRequestToEntity(request);
       commentEntity.setProductEntity(productEntity);

       CommentEntity saveComment = commentRepository.save(commentEntity);
       return CommentMapper.mapEntityToResponse(saveComment);
    }
}
