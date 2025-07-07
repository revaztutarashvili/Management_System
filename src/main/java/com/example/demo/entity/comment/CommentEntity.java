package com.example.demo.entity.comment;

import com.example.demo.entity.product.ProductEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "comment_entity")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(name = "comment_text")
    private String

            text;
    @JoinColumn(name = "product_id")
    @ManyToOne
    private ProductEntity productEntity;

}
