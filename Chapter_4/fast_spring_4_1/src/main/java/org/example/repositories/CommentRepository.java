package org.example.repositories;

import org.example.entity.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
