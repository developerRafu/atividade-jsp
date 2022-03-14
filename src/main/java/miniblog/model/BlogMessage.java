package miniblog.model;

import java.time.LocalDateTime;

public class BlogMessage {
    private Long id;
    private String message;
    private User user;
    private LocalDateTime messageTime = LocalDateTime.now();

    public BlogMessage() {
    }

    public BlogMessage(String message, User user) {
        this.id = System.currentTimeMillis();
        this.message = message;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(LocalDateTime messageTime) {
        this.messageTime = messageTime;
    }
}
