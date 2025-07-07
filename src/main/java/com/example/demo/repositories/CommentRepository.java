package com.example.demo.repositories;

import com.example.demo.entity.comment.CommentEntity;
import com.example.demo.entity.comment.CommentResponse;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    @Query ("""
         select new package com.example.demo.entity.comment(c.id, c.text, c.productEntity.name) from CommentEntity c
         where c.productEntity.id = :productId
""")
    Page<CommentResponse> findCommentsForProduct(Long productId, Pageable pageable);
}
