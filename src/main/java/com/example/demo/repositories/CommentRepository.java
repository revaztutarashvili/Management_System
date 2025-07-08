package com.example.demo.repositories;

import com.example.demo.entity.comment.CommentEntity;
import com.example.demo.entity.comment.CommentResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    @Query("""
    select new com.example.demo.entity.comment.CommentResponse(c.id, c.text, c.productEntity.name)
    from CommentEntity c
    where c.productEntity.id = :productId
""")
    Page<CommentResponse> findCommentsForProduct(Long productId, Pageable pageable);
}
