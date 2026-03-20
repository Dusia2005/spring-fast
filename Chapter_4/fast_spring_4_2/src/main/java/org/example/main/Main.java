package org.example.main;

import org.example.config.ProjectConfiguration;
import org.example.entity.Comment;
import org.example.proxies.EmailNotificationsProxy;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Daria");
        comment.setText("This is my code");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}