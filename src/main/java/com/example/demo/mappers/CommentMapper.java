package com.example.demo.mappers;

import com.example.demo.entity.comment.CommentEntity;
import com.example.demo.entity.comment.CommentRequest;
import com.example.demo.entity.comment.CommentResponse;

public class CommentMapper {

    public static CommentEntity mapRequestToEntity(CommentRequest request){
        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setText(request.getText());
        return  commentEntity;
    }
// ეს მაქვს გასაგრძეელებელიიიიიიიიიიი
    public static CommentResponse mapEntityToResponse(CommentEntity entity){
        CommentResponse commentResponse = new CommentResponse();
        commentResponse.setText(entity.getText());
        commentResponse.setProductName(entity.());
    }
}
