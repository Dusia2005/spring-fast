package org.example.proxies;

import org.example.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationsProxy
        implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notifications for comment: "
                + comment.getText());
    }
}
