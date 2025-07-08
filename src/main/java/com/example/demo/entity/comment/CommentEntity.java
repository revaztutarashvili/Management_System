package com.example.demo.entity.comment;

import com.example.demo.entity.product.ProductEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "comment_entity")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "comment_text")
    private String text;


    @JoinColumn(name = "product_id")
    @ManyToOne
    private ProductEntity productEntity;


    public CommentEntity() {
    }

    public CommentEntity(long id, String text, ProductEntity productEntity) {
        this.id = id;
        this.text = text;
        this.productEntity = productEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
}
