package org.example.proxies;

import org.example.entity.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
