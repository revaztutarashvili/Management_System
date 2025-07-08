package com.example.demo.entity.product;

import com.example.demo.entity.user.UserEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "product_entity")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "count")
    @NotBlank(message = "field should not be empty")
    private Integer count;

    @Column(name = "product_name")
    @NotBlank(message = "field should not be empty")
    private String name;


    @Column(name = "product_description")
    @NotBlank(message = "field should not be empty")
    private String description;


    @ManyToOne
    @JoinColumn(name = "owner_user_id")
    private UserEntity productOwner;



    public ProductEntity() {
    }

    public ProductEntity(int count, String description, String name, UserEntity productOwner) {
        this.count = count;
        this.description = description;
        this.name = name;
        this.productOwner = productOwner;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEntity getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(UserEntity productOwner) {
        this.productOwner = productOwner;
    }
}
