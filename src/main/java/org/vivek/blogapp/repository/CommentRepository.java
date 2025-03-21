package org.vivek.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vivek.blogapp.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
