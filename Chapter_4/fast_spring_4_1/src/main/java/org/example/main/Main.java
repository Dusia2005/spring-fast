package org.example.main;

import org.example.entity.Comment;
import org.example.proxies.EmailNotificationsProxy;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailNotificationsProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Daria");
        comment.setText("This is my code");

        commentService.publishComment(comment);

    }
}