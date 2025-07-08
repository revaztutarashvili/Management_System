package com.example.demo.controller;

import com.example.demo.entity.comment.CommentRequest;
import com.example.demo.entity.comment.CommentResponse;
import com.example.demo.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Comment") //აქ გავწერე path
public class CommentController {

    /**
     * აქ შემომაქვს კომენტარების სერვის კლასი და ვუკეთებ კონსტრუქტორს
     * */
    private final CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public ResponseEntity<CommentResponse> createComment
            (@RequestBody @Valid CommentRequest commentRequest){
                    CommentResponse commentResponse = commentService.create(commentRequest);
             return ResponseEntity.status(HttpStatus.CREATED).body(commentResponse);
    }


    @GetMapping
    public ResponseEntity<Page<CommentResponse>> findByProductId(
        @RequestParam("productId") Long productId,
        @RequestParam("page") Long page,
        @RequestParam("size") Long size
        ){
        commentService.
    }
}


