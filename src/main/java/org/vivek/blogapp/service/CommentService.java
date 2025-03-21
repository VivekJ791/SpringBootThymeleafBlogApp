package org.vivek.blogapp.service;

import org.vivek.blogapp.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
