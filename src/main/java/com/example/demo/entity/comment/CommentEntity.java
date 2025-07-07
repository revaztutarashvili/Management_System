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
    private String text;


    @JoinColumn(name = "product_id")
    @ManyToOne
    private ProductEntity productEntity;


    public CommentEntity() {
    }

    public CommentEntity(long ID, String text, ProductEntity productEntity) {
        this.ID = ID;
        this.text = text;
        this.productEntity = productEntity;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
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
