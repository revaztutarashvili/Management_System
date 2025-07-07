package com.example.demo.mappers;


import com.example.demo.entity.product.ProductEntity;
import com.example.demo.entity.user.UserEntity;
import com.example.demo.entity.user.UserRequest;
import com.example.demo.entity.user.UserResponse;

public class UserMapper {

    public static UserEntity mapRequestToEntity(UserRequest userRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequest.getName());
        userEntity.setUserName(userRequest.getUserName());
        return userEntity;
    }


    public static UserResponse mapEntityToResponse(UserEntity userEntity){
        UserResponse userResponse = new UserResponse();
        userResponse.setName(userEntity.getName());
        userResponse.setUserName(userEntity.getUserName());
        return userResponse;
    }
}
